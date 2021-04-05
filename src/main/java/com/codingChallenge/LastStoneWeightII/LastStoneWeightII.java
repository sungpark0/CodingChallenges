package com.codingChallenge.LastStoneWeightII;

public class LastStoneWeightII {

    public static int lastStoneWeightII(int[] stones) {
        int total = 0;
        int size = stones.length;

        for (int stone : stones) {
            total += stone;
        }

        int[][] dp = new int[size + 1][total / 2 + 1];

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= total/2; j++){
                if(stones[i - 1] <= j){
                    dp[i][j] = Math.max(dp[i - 1][j], stones[i - 1] + dp[i - 1][j - stones[i - 1]]);
                } else dp[i][j] = dp[i - 1][j];
            }
        }

        return total - 2 * dp[size][total / 2];
    }

    public static void main(String[] args) {

    }
}
