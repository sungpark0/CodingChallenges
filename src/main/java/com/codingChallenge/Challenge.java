package com.codingChallenge;

import java.util.*;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day
 * to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class Challenge {

    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int result = 0;
        int maxValue = 0;

        for (int i = prices.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                maxValue = prices[i] - prices[j];
                result = Math.max(result, maxValue);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
/**
 * When you do a coding challenge with an interviewer.
 * 1. Take a moment to read the question. Make sure to read it out loud
 * a. Take your notes while reading it. Writing down Input and Output
 * b. Ask for edge cases. They might be vague on purpose. Ask the right questions.
 * Example: for trapping water, will we ever consider the starting and ending to be walls.
 * c. Make stories, What codes you are thinking and what would be the pros and cons
 * d. Rundown - Give example with actual numbers. Real life examples.
 * e. Ask interviewer if they want me to psuedo code or do the actual code
 * f. Identify Time Complexity and Space Complexity.
 */

