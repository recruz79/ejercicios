package com.recs.ejercicios.algorithms.searchword;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class SearcAlgorithmTest {

    SearchAlgorithms searchAlgorithm = new SearchAlgorithms();
    final String words = "hello this a list of words with a duplicated words hello orphan list of dungeons";

    @Test
    public void testSearchWordOccurrences() {
        List<String> wordList = Arrays.asList(words.split(" "));
        System.out.println("List of words are: " + wordList);
        Integer result = searchAlgorithm.searchWordOccurrences(wordList, "hello");
        System.out.println("Total occurences found: " + result);
    }

    @Test
    public void testSearchWordGroupTotalOccurrences() {
        List<String> wordList = Arrays.asList(words.split(" "));
        System.out.println("List of words are: " + wordList);
        Map<String, Integer> result = searchAlgorithm.searchGroupedWorTotaldOccurrences(wordList);
        System.out.println("Total occurences found: " + result);
    }

    @Test
    public void testSearchWordGroupsWihtMoreThanOneOccurrence() {
        List<String> wordList = Arrays.asList(words.split(" "));
        System.out.println("List of words are: " + wordList);
        Map<String, Integer> result = searchAlgorithm.searchGroupedWorTotaldOccurrences(wordList);
        System.out.println("Total occurences found: " + result);
    }
}
