package com.recs.ejercicios.algorithms.searchword;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchAlgorithms {

    protected Integer searchWordOccurrences(List<String> wordList, String wordToCount) {
        Integer counter = 0;

        for(String word : wordList) {
            if(wordToCount.equals(word)) {
                counter++;
            }
        }

        return counter;
    }

    public Map<String, Integer> searchGroupedWorTotaldOccurrences(List<String> wordList) {
        Map<String, Integer> groupedWords = new HashMap<>();
        for(String word : wordList) {
            if(groupedWords.get(word) != null) {
                Integer value = groupedWords.get(word);
                groupedWords.put(word, ++value);
            } else {
                groupedWords.put(word, 1);
            }
        }

        return groupedWords;
    }
}
