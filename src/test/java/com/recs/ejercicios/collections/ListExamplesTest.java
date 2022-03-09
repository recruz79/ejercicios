package com.recs.ejercicios.collections;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ListExamplesTest {

    ListExamples listExamples;

    @BeforeEach
    public void setUp() {
        listExamples = new ListExamples();
    }

    @Test
    public void givenSortedArraysWhenProcessedThenMergeIsDone() {
        Integer arrayOne[] = {1, 5, 9};
        Integer arrayTwo[] = {3, 4, 5, 10};
        Set result = listExamples.listMergedArrays(arrayOne, arrayTwo);

    }

    @Test
    public void givenPalindromeWhenProcessedThenIsResolved() {
        Integer arrayOne[] = {1, 5, 9};
        Integer arrayTwo[] = {3, 4, 5, 10};
        listExamples.listMergedArrays(arrayOne, arrayTwo);
    }


    @Test
    public void testRemoveNumbersFromList() {
        List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        System.out.println("Total size list: " + list.size());
        List<Integer> result = listExamples.removeNumbersFromList(list);
        System.out.println("Total size list after cleaning: " + result.size());
        assertThat(result.size()).isEqualTo(71);
    }
}
