package com.recs.tutorial.collections;


import com.recs.ejercicios.collections.ListExamples;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

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
}
