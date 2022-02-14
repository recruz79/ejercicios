package com.recs.ejercicios.functional.streams;

import com.recs.ejercicios.functional.ExampleData;
import com.recs.ejercicios.functional.PersonModel;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReduce {

    protected void reduceStreamExample() {
        List<PersonModel> persons = ExampleData.getPersons();

        Optional<Integer> opt = persons.stream()
                .map(PersonModel::getAge)
                .reduce(Integer::sum);
        opt.ifPresentOrElse(
                total -> System.out.printf("The total age value of all persons is: %s %n", total),
                () -> System.out.println("There no persons for sum ages"));

        Integer totalSum = persons.stream()
                .map(PersonModel::getAge)
                .reduce(0, Integer::sum);
        System.out.printf("the total age value of all persons is: %s %n", totalSum);

        // No entiendo como funciona esto
        Integer total2 = persons.stream()
                .reduce(0, (result, product) -> (result + product.getAge()), Integer::sum);
        System.out.printf("The total age value of all persons is: %s %n", total2);

    }

    protected void reduceCollectDifferenceExample() {
        List<PersonModel> persons = ExampleData.getPersons();

        List<String> personsNames = persons.stream().reduce(
                new ArrayList(),
                (list, person) -> {
                    ArrayList<String> newList = new ArrayList<>(list);
                    newList.add(person.getName());
                    return newList;
                },
                (list1, list2) -> {
                    ArrayList<String> newList = new ArrayList<>(list1);
                    newList.addAll(list2);
                    return newList;
                }
        );
        System.out.println("INMUTABLE List of names are: " + personsNames);

        List<String> personsNames2 = persons.stream().collect(ArrayList::new,
                (list, person) -> list.add(person.getName()),
                ArrayList::addAll
        );
        System.out.println("MUTABLE List of names are: " + personsNames2);
    }

}