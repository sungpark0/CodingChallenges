package com.codingChallenge.SearchInRotatedSortedArray;

import java.util.*;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(search(arr, 3));
//        System.out.println(searchII(arr, 3));
    }
//    public static int searchII(int[] nums, int target) {
//        int low = 0;
//        int high = nums.length - 1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//
//            if (nums[mid] == target) return mid;
//
//            if (nums[low] <= nums[mid]) {
//                if (nums[low] <= target && nums[mid] >= target) {
//                    high = mid - 1;
//                } else low = mid + 1;
//            }
//
//            else if (nums[mid] <= nums[high]) {
//                if (nums[mid] <= target && target <= nums[high]) {
//                    low = mid + 1;
//                } else high = mid - 1;
//            }
//        }
//        return -1;
//    }

    public static int search(int[] nums, int target) {
        int pivot = pivot(nums, 0, nums.length - 1);

        if (pivot == -1) return binarySearch(nums, 0, nums.length - 1, target);
        if(nums[pivot] == target) return pivot;

        if (nums[pivot] <= target) return binarySearch(nums, 0, pivot-1, target);
        else return binarySearch(nums, pivot+1, nums.length-1, target);

    }

    public static int pivot(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (high < low) return -1;
        if (low == high) return low;
        if (mid < high && nums[mid] > nums[mid + 1]) return mid;
        if (low < mid && nums[mid] < nums[mid - 1]) return mid - 1;

        if (nums[mid] >= nums[mid]) return pivot(nums, low, mid - 1);
        else return pivot(nums, mid + 1, high);
    }

    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (nums[mid] == target) return mid;

        if (nums[mid] < target) return binarySearch(nums, mid + 1, high, target);
        else return binarySearch(nums, low, mid - 1, target);
    }
}
