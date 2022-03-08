package com.recs.ejercicios.functional.streams;

import com.recs.ejercicios.functional.ExampleData;
import com.recs.ejercicios.functional.PersonModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamCollectors {

    protected void reduceStreamExample() {
        List<PersonModel> persons = ExampleData.getPersons();

        Optional<Integer> opt = persons.stream()
                .map(PersonModel::getAge)
                .reduce(Integer::sum);
        opt.ifPresentOrElse(
                totalAges -> System.out.printf("The total age value of all persons is: %s %n", totalAges),
                () -> System.out.println("There no persons for sum ages"));

        Integer totalAgesSum = persons.stream()
                .map(PersonModel::getAge)
                .reduce(0, Integer::sum);
        System.out.printf("the total age value of all persons is: %s %n", totalAgesSum);

        totalAgesSum = persons.stream()
                .reduce(0, (result, product) -> (result + product.getAge()), Integer::sum);
        System.out.printf("The total age value of all persons is: %s %n", totalAgesSum);

    }

    protected void reduceCollectPersonNamesExample() {
        List<PersonModel> persons = ExampleData.getPersons();

        List<String> reducedPersonsNames = persons.parallelStream().reduce(
                new ArrayList(),
                (list, person) -> {
                    ArrayList<String> newList = new ArrayList<>(list);
                    newList.add(person.getName());
                    return newList;
                },
                (list1, list2) -> {
                    System.out.println("Combiner is being called");
                    ArrayList<String> newList = new ArrayList<>(list1);
                    newList.addAll(list2);
                    return newList;
                }
        );
        System.out.println("INMUTABLE List of names are: " + reducedPersonsNames);

        List<String> collectedPersonsNames = persons.stream().collect(ArrayList::new,
                (list, person) -> list.add(person.getName()),
                ArrayList::addAll
        );
        System.out.println("MUTABLE List of names are: " + collectedPersonsNames);
    }

    protected void reduceAccumulator() {
        List<PersonModel> persons = ExampleData.getPersons();

        Integer agesAccumulator = persons
                .parallelStream()
                .reduce(0,
                        (sum, p) -> {
                            System.out.format("Accumulator: sum=%s; person=%s\n", sum, p);
                            return sum += p.getAge();
                        },
                        (sum1, sum2) -> {
                            System.out.format("Combiner: sum1=%s; sum2=%s\n", sum1, sum2);
                            return sum1 + sum2;
                        });
        System.out.println("Total ages added are: " + agesAccumulator);
    }

}