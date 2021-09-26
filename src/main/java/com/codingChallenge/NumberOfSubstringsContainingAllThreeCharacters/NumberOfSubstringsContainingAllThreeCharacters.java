package com.codingChallenge.NumberOfSubstringsContainingAllThreeCharacters;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static int numberOfSubstrings(String s) {
        int counter = 0;
        int[] chars = new int[3];
        int startingIndex = 0;
        int currentIndex = 0;

        while (currentIndex < s.length()) {
            while (!(chars[0] > 0 && chars[1] > 0 && chars[2] > 0) && currentIndex < s.length()) {
                chars[s.charAt(currentIndex) - 'a']++;
                currentIndex++;
            }

            while (chars[0] > 0 && chars[1] > 0 && chars[2] > 0) {
                counter += s.length() - currentIndex + 1;
                chars[s.charAt(startingIndex) - 'a']--;
                startingIndex++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
