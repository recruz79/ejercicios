package com.recs.ejercicios.functional;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalExample {

    protected void iterateListForEach() {
        IntStream.range(1, 100).forEach(System.out::print);
    }

    protected void createNumbersList() {
        List<Integer> result = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        int total = 0;
        for (int i : result) {
            total += i;
        }

        System.out.println("Total numbers are: " + total);
    }

    protected void sumIntegerStream() {
        System.out.println("The sum of Range 1 to 100 is: " + IntStream.rangeClosed(1, 100).sum());
    }

    protected List<Integer> removeNumbersFromList(List<Integer> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer item = (Integer) it.next();
            if (item < 10 || item > 80) {
                it.remove();
            }
        }
        return list;
    }

    protected List<Integer> removeNumbersFromStream(List<Integer> list) {
        return list.stream().filter(item -> item < 10 || item > 80).collect(Collectors.toList());
    }

    protected void ordenarListaPersonas() {
        List<PersonModel> listaPersonas = ExampleData.getPersons();
        listaPersonas.sort((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        for (PersonModel person : listaPersonas) {
            System.out.println(person);
        }

        listaPersonas.stream().map(PersonModel::getName).forEach(System.out::println);
    }

    protected void filtarPersonasMenoresDeEdad() {
        List<PersonModel> listaPersonas = ExampleData.getPersons();
        listaPersonas.stream().filter(p1 -> (p1.getAge() < 18)).forEach(p1 -> System.out.println(p1.getAge()));
    }

    interface PersonFilter {
        boolean accept(PersonModel personModel);
    }

    protected void filtrarPersonasPorMayoresFemenino() {
        List<PersonModel> listaPersonas = ExampleData.getPersons();
        PersonFilter personFilter = personModel -> personModel.getAge() > 18 && personModel.getGender().equals("femenino");

        for (PersonModel personModel : listaPersonas) {
            if (personFilter.accept(personModel)) {
                System.out.println(personModel);
            }
        }

    }

    static Optional<PersonModel> findPerson(List<PersonModel> persons, Predicate<PersonModel> predicate) {
        for (PersonModel personModel : persons) {
            if (predicate.test(personModel)) {
                return Optional.of(personModel);
            }
        }
        return Optional.empty();
    }

    protected void findPersonByName(String name) {
        List<PersonModel> listaPersonas = ExampleData.getPersons();
        findPerson(listaPersonas, personModel -> personModel.getName().equals(name))
                .map(PersonModel::getAge)
                .map(age -> String.format("We found the person: %s, and is %d old years", name, age))
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.print("No se encontro un usuario con ese name: ")
                );
    }

    protected void findPersonByDocument(String document) {
        List<PersonModel> listaPersonas = ExampleData.getPersons();

        Function<PersonModel, Integer> personToAge = PersonModel::getAge;
        Function<Integer, String> AgeToMessage = age -> String.format("We found the document: %s, and is %d old years", document, age);
        Function<PersonModel, String> personToMessage = personToAge.andThen(AgeToMessage);

        findPerson(listaPersonas, personModel -> personModel.getDocument().equals(document))
                .map(personToMessage)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.print("User not found")
                );
    }

    protected void findPersonByDocumentAngeGender(String document, String gender) {
        List<PersonModel> listaPersonas = ExampleData.getPersons();

        Predicate<PersonModel> isGender = p1 -> p1.getGender().equals(gender);
        Predicate<PersonModel> isDocument = p1 -> p1.getDocument().equals(document);

        findPerson(listaPersonas, isGender.and(isDocument))
                .ifPresentOrElse(
                        person -> System.out.printf("%s found with document %s and gender %s", person.name, person.document, person.gender),
                        () -> System.out.print("User not found")
                );
    }
}
