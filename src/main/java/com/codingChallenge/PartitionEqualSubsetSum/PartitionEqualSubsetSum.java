package com.codingChallenge.PartitionEqualSubsetSum;

public class PartitionEqualSubsetSum {

    public static boolean canPartition(int[] nums) {

        int total = 0;

        for (int num : nums) total += num;

        //If total is odd number its automatically false becase decimal number would be double instead of int
        if (total % 2 != 0) return false;

        int half = total / 2;
        boolean[][] dp = new boolean[nums.length][half + 1];

        for (int i = 0; i < nums.length; i++) dp[i][0] = true;

        for (int i = 1; i <= half; i++) dp[0][i] = (nums[0] == i);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= half; j++) {
                if (dp[i - 1][j]) {
                    dp[i][j] = dp[i - 1][j];
                } else if (j >= nums[i]) {
                    dp[i][j] = dp[i - 1][j - nums[i]];
                }
            }
        }

        return dp[nums.length - 1][half];
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
    }
}
