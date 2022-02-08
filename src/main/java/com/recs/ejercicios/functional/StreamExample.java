package com.recs.ejercicios.functional;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

    protected void createNumbersList() {
        List<Integer> result = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        int total = 0;
        for (int i : result) {
            total += i;
        }

        System.out.println("The sum of Range 1 to 100 is: " + total);
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

}
