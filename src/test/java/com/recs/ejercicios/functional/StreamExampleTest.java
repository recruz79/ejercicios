package com.recs.ejercicios.functional;

import org.junit.jupiter.api.Test;

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
    public void removeNumbersFromList() {
        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        System.out.println("Total size list: " + list.size());
        List<Integer> result = streamExample.removeNumbersFromList(list);
        System.out.println("Total size list after cleaning: " + result.size());
        assertThat(result.size()).isEqualTo(71);
    }

    @Test
    public void removeNumbersFromStream() {
        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        System.out.println("Total size list: " + list.size());
        List<Integer> result = streamExample.removeNumbersFromStream(list);
        System.out.println("Total size list after cleaning: " + result.size());
        assertThat(result.size()).isEqualTo(29);
    }

    @Test
    public void compararPersona() {
        streamExample.ordenarListaPersonas();
    }

    @Test
    public void filtrarPersonasMenoresDeEdad() {
        streamExample.filtarPersonasMenoresDeEdad();
    }
}
