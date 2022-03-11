package com.recs.ejercicios.functional.streams;

import com.recs.ejercicios.functional.ExampleData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamExampleTest {

    StreamExample streamExample = new StreamExample();

    @Test
    public void createNumbersList() {
        streamExample.createNumbersList();
    }

    @Test
    public void testSumIntegerStream() {
        streamExample.sumIntegerStream(10, 100);
    }

    @Test
    public void testGetListOfNumberFromTo() {
        List<Integer> result = streamExample.getListOfNumberFromTo(150, 190);
        System.out.println(result);
    }

    @Test
    public void testRemoveNumbersFromStream() {
        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        System.out.println("Total size list: " + list.size());
        List<Integer> result = streamExample.removeNumbersFromListStream(list);
        System.out.println("Total size list after cleaning: " + result.size());
        assertThat(result.size()).isEqualTo(29);
    }

    @Test
    public void testCompararPersona() {
        streamExample.ordenarListaPersonas(ExampleData.getPersons());
    }

    @Test
    public void testFiltrarPersonasMenoresDeEdad() {
        streamExample.filtarPersonasMenoresDeEdad(ExampleData.getPersons());
    }

    @Test
    public void testFindFirstMatchingPerson() {
        streamExample.findFirstMatchingPerson(ExampleData.getPersons());
    }

    @Test
    public void testFindFirstAnyMatchingPerson() {
        streamExample.findFirstAnyMatchingPerson(ExampleData.getPersons());
    }

    @Test
    public void testStreamBuilderExample() {
        streamExample.streamBuilderExample();
    }

    @Test
    public void testOrderWordsByGroup() {
        String text = "hello how are you hello is are are you fine s";
        List<String>  wordList = Arrays.asList(text.split(" "));
        System.out.println(streamExample.orderWordsByGroup(wordList));
    }

    @Test
    public void testCountWordsByFirstLetter() {
        String text = "hello how are you hello is are are you fine s";
        List<String> wordList = Arrays.asList(text.split(" "));
        System.out.println(streamExample.countWordsByFirstLetter(wordList));
    }
}
