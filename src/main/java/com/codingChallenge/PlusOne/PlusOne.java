package com.codingChallenge.PlusOne;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] edgeCase = new int[digits.length + 1];
            edgeCase[0] = 1;
            return edgeCase;
        }

        return digits;
    }

    public static void main(String[] args) {

    }
}
