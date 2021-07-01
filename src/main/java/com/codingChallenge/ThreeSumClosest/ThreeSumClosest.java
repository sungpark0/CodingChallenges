package com.codingChallenge.ThreeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int min = nums[i] + nums[j] + nums[k] - target;
                if (min == 0) return target;
                sum = Math.abs(min) < Math.abs(sum) ? min : sum;
                if (min > 0) k--;
                else j++;
            }
        }

        return target + sum;
    }

    public static void main(String[] args) {

    }
}
