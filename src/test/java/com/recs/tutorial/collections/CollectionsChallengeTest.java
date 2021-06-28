package com.recs.tutorial.collections;


import com.recs.ejercicios.collections.CollectionsChallenge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by recruz on 09/01/2017.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CollectionsChallengeTest {

    CollectionsChallenge collectionsChallenge;

    @BeforeEach
    public void setUp() {
        collectionsChallenge = new CollectionsChallenge();
    }

    @Test
    public void givenSortedArraysWhenProcessedThenMergeIsDone() {
        Integer arrayOne[] = {1, 5, 9};
        Integer arrayTwo[] = {3, 4, 5, 10};
        collectionsChallenge.mergeSortedArrays(arrayOne, arrayTwo);
    }

    @Test
    public void givenPalindromeWhenProcessedThenIsResolved() {
        Integer arrayOne[] = {1, 5, 9};
        Integer arrayTwo[] = {3, 4, 5, 10};
        collectionsChallenge.mergeSortedArrays(arrayOne, arrayTwo);
    }
}
