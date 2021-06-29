package com.codingChallenge.CountPrimes;

public class CountPrimes {

    public static int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] checker = new boolean[n];
        int primeNums = 0;

        for (int i = 2; i < n; i++) {
            if (!checker[i]) {
                primeNums++;
                for (int j = 2; (i * j) < n; j++) {
                    checker[i * j] = true;
                }
            }
        }

        return primeNums;
    }

    public static void main(String[] args) {

    }
}
