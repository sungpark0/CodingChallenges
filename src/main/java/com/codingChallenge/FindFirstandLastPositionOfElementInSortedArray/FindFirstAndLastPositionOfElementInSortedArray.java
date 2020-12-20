package com.codingChallenge.FindFirstandLastPositionOfElementInSortedArray;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {2, 2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] >= target) {
                end = mid;
            } else start = mid + 1;
        }
        int firstIndex = start;
        start = 0;
        end = nums.length;
        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] > target)
                end = mid;
            else
                start = mid + 1;
        }
        int lastIndex = start;
        if (firstIndex >= lastIndex) {
            return new int[]{-1, -1};
        }
        return new int[]{firstIndex, lastIndex - 1};

//        int[] result = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
//        findFirstIndex(nums, 0, nums.length - 1, target, result);
//        findLastIndex(nums, 0, nums.length - 1, target, result);
//        if (result[0] > result[1]) return new int[]{-1, -1};

    }


    public static void findFirstIndex(int[] nums, int start, int end, int target) {
    }

    public static void findLastIndex(int[] nums, int start, int end, int target) {
    }

}
