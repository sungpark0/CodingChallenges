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
            for(int j =0; j< words.length; j++){
                if(frequency(queries[i]) < frequency(words[j])){
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

        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] < smallest) {
                smallest = strChar[i];
                counter = 1;
            }
            else if (smallest == strChar[i]) {
                counter++;
            }
        }
        return counter;
    }
}
