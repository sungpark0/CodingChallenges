package com.rootbyos.springboot.TwoSum;

import java.util.*;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSumHash( nums, target );
    }

    public static int[] twoSumHash(int[] nums, int target) {

        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i]; // to find the 2nd num in the array
            if (hash.containsKey( difference )) { //looking thru if 2nd num exist in the hashmap
                return new int[]{hash.get( difference ), i};
            }
            hash.put( nums[i], i );
        }
        throw new IllegalArgumentException( "No two sum arrays" ); // if nothing found. return "no two sum arrays"
    }
}
