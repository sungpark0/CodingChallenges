package com.codingChallenge.SubstringsOfSizeThreeWithDistinctCharacters;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static int countGoodSubstrings(String s) {
        int counter = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            char third = s.charAt(i + 2);

            if (first != second && first != third && second != third) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
