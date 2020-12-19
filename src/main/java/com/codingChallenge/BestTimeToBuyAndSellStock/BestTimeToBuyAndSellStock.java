package com.codingChallenge.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] testOne = {7, 1, 5, 3, 6, 4};
        int[] testTwo = {7, 6, 4, 3, 2};

        System.out.println( maxProfit( testOne ) );
        System.out.println( maxProfitMath( testTwo ) );

    }

    public static int maxProfit(int[] prices) {
        int potentialProfit;
        int maxProfit = 0;

        if (prices.length == 2 && prices[0] < prices[1]) {
            return prices[1] - prices[0];
        }


        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                potentialProfit = prices[j] - prices[i];
                if (potentialProfit > maxProfit) {
                    maxProfit = potentialProfit;
                }
            }
        }
        return maxProfit;

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

            maxProfit = Math.max( maxProfit, potentialProfit );
            // returns the larger number between maxProfit and potentialProfit
            lowestVal = Math.min( lowestVal, potentialVal );
            // returns the smaller number between lowestVal and potentialVal
        }

        return maxProfit;
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

