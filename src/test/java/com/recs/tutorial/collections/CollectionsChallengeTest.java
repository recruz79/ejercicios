package com.recs.tutorial.collections;


import com.recs.ejercicios.collections.CollectionsTutorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CollectionsChallengeTest {

    CollectionsTutorial collectionsChallenge;

    @BeforeEach
    public void setUp() {
        collectionsChallenge = new CollectionsTutorial();
    }

    @Test
    public void givenSortedArraysWhenProcessedThenMergeIsDone() {
        Integer arrayOne[] = {1, 5, 9};
        Integer arrayTwo[] = {3, 4, 5, 10};
        collectionsChallenge.listMergedArrays(arrayOne, arrayTwo);
    }

    @Test
    public void givenPalindromeWhenProcessedThenIsResolved() {
        Integer arrayOne[] = {1, 5, 9};
        Integer arrayTwo[] = {3, 4, 5, 10};
        collectionsChallenge.listMergedArrays(arrayOne, arrayTwo);
    }
}
