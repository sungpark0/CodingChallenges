package com.codingChallenge.OnesAndZeroes;

public class OnesAndZeroes {

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {
            int zeroes = 0;
            int ones = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0') zeroes++;
                else ones++;
            }

            for (int x = m; x >= zeroes; x--) {
                for (int y = n; y >= ones; y--) {
                    dp[x][y] = Math.max(dp[x][y], dp[x - zeroes][y - ones] + 1);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {

    }
}
