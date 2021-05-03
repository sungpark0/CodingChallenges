package com.codingChallenge.BestTimeToBuyAndSellStockWithCooldown;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockWithCooldown {

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;

        int[] dp = new int[prices.length];
        dp[0] = 0;
        dp[1] = Math.max(0, prices[1] - prices[0]);
        int tempProfit = Math.max(-prices[0], -prices[1]);

        for (int i = 2; i < prices.length; i++) {
            tempProfit = Math.max(tempProfit, dp[i - 2] - prices[i]);
            dp[i] = Math.max(dp[i - 1], tempProfit + prices[i]);
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
