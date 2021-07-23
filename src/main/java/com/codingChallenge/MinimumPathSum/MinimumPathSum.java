package com.codingChallenge.MinimumPathSum;

import java.util.Arrays;

public class MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        int row = grid[0].length;
        int col = grid.length;
        int[][] dp = new int[col][row];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < row; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < col; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        
//        for (int i = 1; i < col; i++) {
//            for (int j = 1; j < row; j++) {
//                int minValue = Math.min(dp[i - 1][j], dp[i][j - 1]);
//                dp[i][j] = minValue + grid[i][j];
//            }
//        }

        return dp[col - 1][row - 1];
    }

    public static int minPathSumII(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }

        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }

    public static void main(String[] args) {
//        System.out.println(minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println(minPathSum(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}));
    }
}
