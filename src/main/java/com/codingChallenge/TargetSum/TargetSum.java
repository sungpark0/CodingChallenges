package com.codingChallenge.TargetSum;

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum < target || (target + sum) % 2 != 0) return 0;

        int temp = (target + sum) / 2;

        int[] dp = new int[temp + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = temp; j >= num; j--) {
                dp[j] = dp[j] + dp[j - num];
            }
        }

        return dp[temp];
    }

    public static void main(String[] args) {

    }
}
