package com.codingChallenge;

import java.util.ArrayList;
import java.util.*;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly
 * one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * input: list of nums, target
 * output: list of indices
 * <p>
 * Edge cases:
 * - positive values? no
 * - the output will always be unique values
 * <p>
 * input:
 * nums = [1,2,3,4,10] target= 7
 * output:
 * [2,3]
 */

public class MockInterview {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSumII(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
    }

    public static int[] twoSumII(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                indices[0] = map.get(complement);
                indices[1] = i;
            }
            map.put(nums[i], i);
        }


        return indices;
    }
}
