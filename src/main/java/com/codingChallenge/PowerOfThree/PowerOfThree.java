package com.codingChallenge.PowerOfThree;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {
        if (n == 0) return false;

        while (n != 1) {
            if (n % 3 != 0) return false;
            else n = n / 3;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
