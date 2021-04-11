package com.codingChallenge.UniquePathsII;

public class UniquePathsII {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int col = obstacleGrid.length;
        int row = obstacleGrid[0].length;

        int[][] dp = new int[col][row];

        for (int i = 0; i < row; i++){
            if(obstacleGrid[0][i] != 1) dp[0][i] = 1;
            else break;
        }

        for (int i = 0; i < col; i++){
            if(obstacleGrid[i][0] != 1) dp[i][0] = 1;
            else break;
        }

        for (int i = 1; i < col; i++){
            for (int j = 1; j < row; j++){
                if(obstacleGrid[i][j] != 1) dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[col - 1][row - 1];
    }

    public static void main(String[] args) {

    }
}
