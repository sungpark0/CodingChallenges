package com.codingChallenge.MaximalSquare;

import java.util.Arrays;

public class MaximalSquare {

    public static int maximalSquare(char[][] matrix) {
        int length = 0;
        int col = matrix.length;
        int row = matrix[0].length;
        int[][] dp = new int[col + 1][row + 1];

        for (int i = 1; i < col + 1; i++) {
            for (int j = 1; j < row + 1; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i][j - 1]) + 1;
                    length = Math.max(length, dp[i][j]);
                }
            }
        }

        return length * length;
    }

    public int maximalSquareII(char[][] matrix) {
        int length = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                dp[i][j] = matrix[i][j] - '0';
                if(i == 0 || j == 0) length = Math.max(length, dp[i][j]);
                else if(matrix[i][j] == '1'){
                    dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                    length = Math.max(length, dp[i][j]);
                }
            }
        }

        return length * length;
    }

    public static void main(String[] args) {
        System.out.println(maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '0'},
                {'1', '0', '1', '1', '0'},
                {'0', '0', '0', '0', '0'}
        }));
    }
}
