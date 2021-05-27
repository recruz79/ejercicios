package com.recs.tutorial.collections;


import com.recs.algoritmos.collections.CollectionsChallenge;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by recruz on 09/01/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CollectionsChallengeTest {

    CollectionsChallenge collectionsChallenge;

    @Before
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
