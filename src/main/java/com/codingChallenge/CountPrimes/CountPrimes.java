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

    public static int countPrimesII(int n) {
        if (n == 0 || n == 1 || n == 2) return 0;

        boolean[] nums = new boolean[n];

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!nums[i]) {
                for (int j = i * i; j < nums.length; j += i) {
                    nums[j] = true;
                }
            }
        }

        int primeNums = 0;

        for (int i = 2; i < nums.length; i++) {
            if (!nums[i]) primeNums++;
        }

        return primeNums;
    }

    public static void main(String[] args) {

    }
}
