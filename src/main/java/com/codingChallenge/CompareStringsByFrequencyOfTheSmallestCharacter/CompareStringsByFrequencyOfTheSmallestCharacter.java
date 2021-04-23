package com.codingChallenge.CompareStringsByFrequencyOfTheSmallestCharacter;

import java.util.Arrays;

public class CompareStringsByFrequencyOfTheSmallestCharacter {
    public static void main(String[] args) {
        String[] que = {"bbb", "cc"};
        String[] word = {"a", "aa", "aaa", "aaaa"};
        String w = "zaazza";
        System.out.println(Arrays.toString(numSmallerByFrequency(que, word)));

    }

    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] results = new int[queries.length];

        for(int i =0; i<queries.length; i++){
            int counter =0;
            for (String word : words) {
                if (frequency(queries[i]) < frequency(word)) {
                    counter++;
                }
            }
            results[i]= counter;
        }
        return results;

    }

    public static int frequency(String str) {
        int counter = 0;
        char smallest = 'z';
        char[] strChar = str.toCharArray();

        for (char c : strChar) {
            if (c < smallest) {
                smallest = c;
                counter = 1;
            } else if (smallest == c) {
                counter++;
            }
        }
        return counter;
    }
}
