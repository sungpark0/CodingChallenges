package com.codingChallenge.SplitAStringInBalancedStrings;

public class SplitAStringInBalancedStrings {

    public static int balancedStringSplit(String s) {
        int counter = 0;
        int balanced = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'R') balanced++;
            else balanced--;

            if (balanced == 0) counter++;
        }


        return counter;
    }

    public static void main(String[] args) {

    }
}
