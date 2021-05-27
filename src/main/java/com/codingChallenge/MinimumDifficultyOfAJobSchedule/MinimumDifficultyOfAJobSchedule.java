package com.codingChallenge.MinimumDifficultyOfAJobSchedule;

public class MinimumDifficultyOfAJobSchedule {

    public static int minDifficulty(int[] jobDifficulty, int d) {
        if(jobDifficulty.length < d) return -1;

        int[][] dp = new int[d][jobDifficulty.length];
        dp[0][0] = jobDifficulty[0];

        for(int i = 1;  i < jobDifficulty.length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], jobDifficulty[i]);
        }

        for (int i = 1 ; i < d; i++) {
            for (int j = i; j < jobDifficulty.length; j++) {
                int temp = jobDifficulty[j];
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = j; k >= i; k--) {
                    temp = Math.max(temp, jobDifficulty[k]);
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k - 1] + temp);
                }
            }
        }

        return dp[d - 1][jobDifficulty.length - 1];
    }

    public static void main(String[] args) {

    }
}
