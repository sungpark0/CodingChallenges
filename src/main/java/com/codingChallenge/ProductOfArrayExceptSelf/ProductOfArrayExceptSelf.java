package com.codingChallenge.ProductOfArrayExceptSelf;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Example 1: Input nums = [1, 2, 3, 4]
 * Output: [24, 12, 8, 6]
 * <p>
 * Example 2: Input nums = [-1, 1, 0, -3, 3]
 * Output = [0, 0, 9, 0, 0]
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int temp = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }


        return result;
    }

    public static int[] productExceptSelfIII(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];

        left[0] = 1;
        right[right.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    public static int[] productExceptSelfII(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int temp = 1;
        for(int i = nums.length -1; i>=0; i--){
            result[i] = temp * result[i];
            temp = temp * nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelfII(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelfII(new int[]{-1, 1, 0, -3, 3})));
    }
}
