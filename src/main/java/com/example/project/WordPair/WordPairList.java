package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (i != j) {
                    allPairs.add(new WordPair(words[i], words[j]));
                }
            }
        }
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        int matches = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            WordPair currentPair = allPairs.get(i);
            if (currentPair.getFirst().equals(currentPair.getSecond())) {
                matches++;
            }
        }
        return matches;
    }
    

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
