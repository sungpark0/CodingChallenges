package com.codingChallenge.NumberOfLongestIncreasingSubsequence;

public class NumberOfLongestIncreasingSubsequence {

    public static int findNumberOfLIS(int[] nums) {
        int[] lengthDP = new int[nums.length];
        int[] countDP = new int[nums.length];
        int maxLength = 1;

        for (int i = 0; i < nums.length; i++) {
            lengthDP[i] = 1;
            countDP[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (lengthDP[i] < lengthDP[j] + 1) {
                        lengthDP[i] = lengthDP[j] + 1;
                        countDP[i] = countDP[j];
                        maxLength = Math.max(maxLength, lengthDP[i]);
                    } else if (lengthDP[i] == lengthDP[j] + 1) {
                        countDP[i] += countDP[j];
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i < lengthDP.length; i++) {
            if (lengthDP[i] == maxLength) result += countDP[i];
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
