package com.codingChallenge.BestTimeToBuyAndSellStock;

import java.util.*;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] testOne = {7, 1, 5, 3, 6, 4};
        int[] testTwo = {7, 6, 4, 3, 2};

        System.out.println(maxProfit(testOne));
        System.out.println(maxProfitMath(testTwo));
    }

    public static int maxProfit(int[] prices) {
//        return bottomTop(prices);

        return recursion(prices, Integer.MAX_VALUE, 0, 0);
    }

    public static int maxProfitMath(int[] prices) {
        if (prices.length < 2)
            return 0; // Because if less than 2 elements there cant be any transaction define by the problem.

        //7 1 5 3 6 4
        int lowestVal = prices[0]; // 7
        int maxProfit = prices[1] - prices[0]; // 6-7 =-1
        for (int potentialVal : prices) { // for-each loop from potentialVal to end of array prices.
            // 7 1 5 3 6 4  to 7 1 5 3 6 4
            // 7 1 5 3 6 4
            //
            //
            // 7 1 5 3 6 4
            int potentialProfit = potentialVal - lowestVal;

            maxProfit = Math.max(maxProfit, potentialProfit);
            // returns the larger number between maxProfit and potentialProfit
            lowestVal = Math.min(lowestVal, potentialVal);
            // returns the smaller number between lowestVal and potentialVal
        }

        return maxProfit;
    }

    public static int maxProfitII(int[] prices) {
//        if (prices.length < 2) return 0;
//
//        int max = 0;
//        int low = Integer.MAX_VALUE;
//
//        for (int price : prices) {
//            low = Math.min(low, price);
//            max = Math.max(max, price - low);
//        }
//
//
//        return max;
        Map<int[], Integer> map = new HashMap<>();
        return topBottom(prices, Integer.MAX_VALUE, 0, 0, map);
    }

    public static int bottomTop(int[] prices) {
        if (prices.length < 2) return 0;

        int[] dp = new int[prices.length];
        int minValue = prices[0];

        for (int i = 1; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - minValue);

        }

        return dp[dp.length - 1];
    }

    public static int recursion(int[] prices, int min, int max, int index) {
        if (index == prices.length) {
            return max;
        }

        max = Math.max(max, prices[index] - min);
        min = Math.min(min, prices[index]);

        return recursion(prices, min, max, index + 1);
    }

    public static int topBottom(int[] prices, int min, int max, int index, Map<int[], Integer> map) {
        if (index == prices.length) {
            return max;
        }
        int[] arr = new int[2];
        arr[0] = prices[index];
        arr[1] = min;

        if (map.containsKey(arr)) {
            return map.get(arr);
        }

        min = Math.min(min, prices[index]);
        max = Math.max(max, prices[index] - min);

        map.put(arr, max);

        return topBottom(prices, min, max, index + 1, map);
    }
}

//    int buy = Integer.MAX_VALUE;
//    int sell = 0;
//    int profit;
//    int buyIndex = 0;
//
//        if(prices.length==2&&prices[0]<prices[1]){  //
//        return prices[1]-prices[0];
//        }
//
//        for(int i=0;i<prices.length-1;i++){ // buy
//        if(buy>prices[i]&&prices[i]!=0){
//        buy=prices[i];
//        buyIndex=i;
//        }
//        }
//        int i=buyIndex;
//        int j=i;
//        for(;i<prices.length;i++){ // sell
//        for(;j<prices.length;j++){
//        if(prices[i]<prices[j]){
//        sell=prices[j];
//        break;
//        }
//        }
//        }
//        profit=sell-buy;
//        if(profit<=0){
//        profit=0;
//        }
//        return profit;

