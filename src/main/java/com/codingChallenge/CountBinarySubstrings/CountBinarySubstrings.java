package com.codingChallenge.CountBinarySubstrings;

public class CountBinarySubstrings {

    public static int countBinarySubstrings(String s) {
        int counter = 0;
        int ones = 0;
        int zeroes = 0;
        int prev = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                if (prev == 1) {
                    zeroes = 0;
                }
                zeroes++;
                prev = 0;
            } else if (ch == '1') {
                if (prev == 0) {
                    ones = 0;
                }
                ones++;
                prev = 1;
            }
            if ((prev == 1 && ones <= zeroes) || (prev == 0 && ones >= zeroes)) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
