package com.codingChallenge.MaximumAverageSubarrayI;

public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double currSum = 0;

        int startingIndex = 0;
        int endingIndex = 0;

        while (endingIndex < nums.length) {
            currSum += nums[endingIndex];

            if (endingIndex >= k - 1) {
                maxAvg = Math.max(maxAvg, currSum / k);
                currSum -= nums[startingIndex];
                startingIndex++;
            }

            endingIndex++;
        }

        return maxAvg;
    }

    public static void main(String[] args) {

    }
}
