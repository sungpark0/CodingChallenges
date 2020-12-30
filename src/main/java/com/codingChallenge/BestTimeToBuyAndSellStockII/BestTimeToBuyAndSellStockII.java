package com.codingChallenge.BestTimeToBuyAndSellStockII;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
//        int[] prices = {1, 2, 3, 4, 5};
        int[] nums = {7, 1, 8, 3, 1, 6, 2};
//        System.out.println(maxProfit(prices));
        System.out.println(maxProfitII(nums));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                sum += prices[i + 1] - prices[i];
            }
        }
        return sum;
    }

    public static int maxProfitII(int[] prices) {
        int totProfit = 0;
        int lowestPrice = prices[0];

        for (int i = 0; i < prices.length - 1; i++) {
            int currentPrice = prices[i];
            int potPrice = prices[i + 1];

            if ((potPrice < currentPrice) || (prices.length - 1 == i + 1 && potPrice >= currentPrice)) {
                int price = potPrice >= currentPrice ? potPrice : currentPrice;
                totProfit += (price - lowestPrice);
                lowestPrice = potPrice;
            }
        }
        return totProfit;
    }
}
