package com.codingChallenge.MinimumCostForTickets;

public class MinimumCostForTickets {

    public static int minCostTickets(int[] days, int[] costs) {
        int n = days[days.length - 1];
        int[] dp = new int[n + 1];

        int j = 0;
        for (int i = 1; i < dp.length; i++) {
            if (days[j] == i) {
                int daily = dp[i - 1] + costs[0];
                int weekly = i > 7 ? dp[i - 7] + costs[1] : costs[1];
                int monthly = i > 30 ? dp[i - 30] + costs[2] : costs[2];
                dp[i] = Math.min(Math.min(daily, weekly), monthly);
                j++;
            } else dp[i] = dp[i - 1];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(minCostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
    }
}
