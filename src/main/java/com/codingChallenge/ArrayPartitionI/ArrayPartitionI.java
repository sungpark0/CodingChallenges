package com.codingChallenge.ArrayPartitionI;

import java.util.Arrays;

public class ArrayPartitionI {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int max = 0;

        for (int i = 0; i < nums.length; i += 2) {
            max += Math.min(nums[i], nums[i + 1]);
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
