package com.rootbyos.springboot.MaximumSubarray;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubarray(arr));
        System.out.println(maximumSubarrayII(arr));
    }

    public static int maximumSubarray(int[] nums) {
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                result = Math.max(sum, result);
            }
        }

        return result;
    }

    public static int maximumSubarrayII(int[] nums) {

        int sum = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max((sum + nums[i]), nums[i]);
            result = Math.max(result, sum);
        }

        return result;
    }
}
