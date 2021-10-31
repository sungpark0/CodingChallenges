package com.codingChallenge.LargestPerimeterTriangle;

import java.util.Arrays;

public class LargestPerimeterTriangle {

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) return nums[i] + nums[i - 1] + nums[i - 2];
        }

        return 0;
    }


    public static void main(String[] args) {

    }
}
