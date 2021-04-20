package com.codingChallenge.OutOfBoundaryPaths;

public class OutOfBoundaryPaths {

    public static int findPaths(int m, int n, int N, int i, int j) {
        int[][] dp = new int[m][n];
        int mod = 1000000007;

        for (int k = 1; k <= N; k++) {
            int[][] curr = new int[m][n];
            for (int col = 0; col < m; col++) {
                for (int row = 0; row < n; row++) {
                    curr[col][row] = (curr[col][row] + (col == m - 1 ? 1 : dp[col + 1][row])) % mod;
                    curr[col][row] = (curr[col][row] + (col == 0 ? 1 : dp[col - 1][row])) % mod;
                    curr[col][row] = (curr[col][row] + (row == 0 ? 1 : dp[col][row - 1])) % mod;
                    curr[col][row] = (curr[col][row] + (row == n - 1 ? 1 : dp[col][row + 1])) % mod;
                }
            }
            dp = curr;
        }

        return dp[i][j] % mod;
    }

    public static void main(String[] args) {

    }
}
