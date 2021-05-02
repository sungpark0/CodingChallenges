package com.codingChallenge.UniqueBinarySearchTrees;

public class UniqueBinarySearchTrees {
    public static int numTrees(int n) {
        if(n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = dp[i] + (dp[i - j] * dp[j - 1]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(numTrees(4));
    }
}
