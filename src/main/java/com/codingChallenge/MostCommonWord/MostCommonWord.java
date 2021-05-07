package com.codingChallenge.MostCommonWord;

import java.util.*;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] terms = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split(" ");
        List<String> bannedWords = new ArrayList<>(Arrays.asList(banned));
        HashMap<String, Integer> hm = new HashMap<>();
        String result = "";
        int freq = Integer.MIN_VALUE;

        for (String term : terms) {
            if (!bannedWords.contains(term)) {
                hm.put(term, hm.getOrDefault(term, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> map : hm.entrySet()) {
            if (map.getValue() > freq) {
                freq = map.getValue();
                result = map.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
