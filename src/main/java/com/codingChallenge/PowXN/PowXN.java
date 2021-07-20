package com.codingChallenge.PowXN;

public class PowXN {

    public static double myPow(double x, int n) {
        if (n == 0) return 1;

        double sum = 1;
        double currentValue = x;

        for (long i = Math.abs((long)n); i > 0; i /= 2) {
            if (i % 2 == 1) {
                sum *= currentValue;
            }
            currentValue *= currentValue;
        }

        return n < 0 ? 1 / sum : sum;
    }

    public static void main(String[] args) {

    }
}
