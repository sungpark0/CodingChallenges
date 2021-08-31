package com.codingChallenge.SquareOfASortedArray;

import java.util.Arrays;

public class SquareOfASortedArray {

    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }

    public static int[] sortedSquaresII(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {

    }
}
