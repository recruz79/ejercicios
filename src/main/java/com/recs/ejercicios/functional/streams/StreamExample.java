package com.recs.ejercicios.functional.streams;

import com.recs.ejercicios.functional.GenderType;
import com.recs.ejercicios.functional.PersonModel;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    protected void checkStreamsCreation(List<PersonModel> persons) {
        Stream<PersonModel> stream1 = persons.stream();

        String[] array = new String[]{"one", "two", "three"};
        Stream<String> stream2 = Arrays.stream(array);

        Stream<String> stream3 = Stream.of("one", "two", "three");

        Stream<String> stream4 = Stream.ofNullable("one");

        Stream<String> stream5 = Stream.empty();

        IntStream dice = new Random().ints(1, 7);
    }

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

    protected void ordenarListaPersonas(List<PersonModel> listaPersonas) {
        listaPersonas.sort((p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        for (PersonModel person : listaPersonas) {
            System.out.println(person);
        }

        listaPersonas.stream().map(PersonModel::getName).forEach(System.out::println);
    }

    protected void filtarPersonasMenoresDeEdad(List<PersonModel> persons) {
        persons.stream().filter(p1 -> (p1.getAge() < 18)).forEach(p1 -> System.out.println(p1.getAge()));
    }

    protected void findFirstMatchingPerson(List<PersonModel> persons) {
        Optional<PersonModel> opt = persons.stream()
                .filter(person -> person.getGender() == GenderType.FEMENINO)
                .findFirst();
        opt.ifPresent(System.out::println);
    }

    protected void findFirstAnyMatchingPerson(List<PersonModel> persons) {
        boolean personFound = persons.stream()
                .anyMatch(person -> person.getGender() == GenderType.MASCULINO);

        System.out.println("Person found? " + personFound);
    }

    protected void streamBuilderExample() {
        Stream<UUID> uuids = Stream.generate(UUID::randomUUID);
        uuids.limit(10).forEach(System.out::println);

        Stream<BigInteger> powerOfTwo = Stream.iterate(BigInteger.ONE, n -> n.multiply(BigInteger.TWO));
        powerOfTwo.limit(20).forEach(System.out::println);

        Stream<Character> alphabet = Stream.iterate('A', letter -> letter <= 'Z', letter -> (char) (letter +1));
        alphabet.forEach(System.out::println);

        Stream.Builder<String> builder = Stream.builder();
        builder.add("one");
        builder.add("two");
        builder.add("three");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

}
