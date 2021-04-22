package com.codingChallenge.NumberOfLongestIncreasingSubsequence;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence {

    public static int findNumberOfLIS(int[] nums) {
        int[] lengthDP = new int[nums.length];
        int[] counts = new int[nums.length];
        int maxLength = 1;
        Arrays.fill(lengthDP, 1);
        Arrays.fill(counts, 1);

        for (int i = 0; i < nums.length - 1; i++) {
            int length = lengthDP[i] + 1;
            int count = counts[i];
            boolean bool = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    if (length == lengthDP[j]) {
                        counts[j] += count;
                    } else if (length > lengthDP[j]) {
                        bool = true;
                        lengthDP[j] = length;
                        counts[j] = count;
                    }
                }
            }
            maxLength = (bool && (length > maxLength)) ? length : maxLength;
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxLength == lengthDP[i]) result += counts[i];
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
