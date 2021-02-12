package com.codingChallenge.ClimbingStairs;

public class ClimbingStairs {

    public static int climbStairsTabulation(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static int climbStairs(int n) {
        int[] arr = new int[n+1];

        return climbMemoization(arr, n);
    }

    public static int climbMemoization(int[] storage, int n){
        if(n == 1) return 1;
        if(n == 2) return 2;

        if(storage[n] != 0) return storage[n];

        storage[n] = climbMemoization(storage, n-1) + climbMemoization(storage, n-2);

        return storage[n];
    }

    public static void main(String[] args) {

    }
}
