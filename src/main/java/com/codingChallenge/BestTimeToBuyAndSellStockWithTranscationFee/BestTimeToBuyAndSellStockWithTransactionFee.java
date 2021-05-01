package com.codingChallenge.BestTimeToBuyAndSellStockWithTranscationFee;

public class BestTimeToBuyAndSellStockWithTransactionFee {

    public static int maxProfit(int[] prices, int fee) {
        if (prices.length < 2) return 0;

        int[] dp = new int[prices.length];
        int profit = 0;
        int minValue = prices[0];
        int prevValue = 0;

        for (int i = 1; i < dp.length; i++) {
            dp[i] = prices[i] - minValue - fee + prevValue;
            if (profit - prices[i] > prevValue - minValue) {
                minValue = prices[i];
                prevValue = profit;
            }
            profit = Math.max(profit, dp[i]);
        }
        
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }
}
