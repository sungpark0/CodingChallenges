package com.codingChallenge;

public class Dummy {
    public static void main(String[] args) {
        countGoodSubstrings("aababcabc");
    }

    public static int countGoodSubstrings(String s) {
        if (s.length() < 3) return 1;

        return helper(s, 0, 2);
    }

    public static int helper(String s, int counter, int index) {
        if (index >= s.length()) return counter;


        char first = s.charAt(index - 2);
        char second = s.charAt(index - 1);
        char third = s.charAt(index);

        if (first != second && first != third && second != third) counter++;

        // index++;

        return helper(s, counter, index+1);
    }
}
