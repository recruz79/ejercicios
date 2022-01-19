package com.recs.ejercicios.functional;

import com.recs.model.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Functional is composed with the following functionalities:
 */
public class FunctionalExample {

    // Iteramos una lista del 1 al 100 y la imprimimos
    protected void iterateListForEach() {
        IntStream.range(1, 100).forEach(System.out::print);
    }

    // Creamos una lista de numeros y la asignamos a un List
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

    protected List<Integer> removePairNumbersFromStream(List<Integer> list) {
        List<Integer> result = list.stream().filter(item -> item < 10 || item > 80).collect(Collectors.toList());
        return result;
    }

    protected void ordenasListaPersonas() {
        List<PersonModel> listaPersonas = ExampleData.getPersons();
        listaPersonas.sort((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        for(PersonModel person : listaPersonas) {
            System.out.println(person);
        }
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
        PersonFilter personFilter = personModel -> personModel.getAge() > 18 && personModel.getGenero().equals("femenino");

        for(PersonModel personModel: listaPersonas) {
            if(personFilter.accept(personModel)) {
                System.out.println(personModel);
            }
        }
    }
}
