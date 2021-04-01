package com.codingChallenge.MinimumFallingPathSum;

public class MinimumFallingPathSum {

    public static int minFallingPathSum(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;

        int[][] dp = new int[col][row];

        System.arraycopy(matrix[col - 1], 0, dp[col - 1], 0, row);

        for (int i = col - 2; i >= 0; i--) {
            for (int j = 0; j < row; j++) {
                if (j == 0) {
                    dp[i][j] = matrix[i][j] + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
                } else if (j == row - 1) {
                    dp[i][j] = matrix[i][j] + Math.min(dp[i + 1][j], dp[i + 1][j - 1]);
                } else {
                    dp[i][j] = matrix[i][j] + Math.min(Math.min(dp[i + 1][j - 1], dp[i + 1][j]), dp[i + 1][j + 1]);
                }
            }
        }

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < row; i++) {
            result = Math.min(result, dp[0][i]);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(minFallingPathSum(new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));
    }
}
