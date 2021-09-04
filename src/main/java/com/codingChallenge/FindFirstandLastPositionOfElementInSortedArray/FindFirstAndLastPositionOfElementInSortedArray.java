package com.codingChallenge.FindFirstandLastPositionOfElementInSortedArray;

import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastPositionOfElementInSortedArray {

    private int lastIndex;

    public static void main(String[] args) {
        int[] nums = {2, 2};
        int target = 2;
//        System.out.println(Arrays.toString(findTheHighAndLowIndex(List.of(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6), 2))); // low = 15, high = 17
//        System.out.println(Arrays.toString(findTheHighAndLowIndex(List.of(1), 1))); // low = 15, high = 17
    }

//    public static int[] searchRange(int[] nums, int target) {
//        int start = 0;
//        int end = nums.length;
//        int mid;
//        while (start < end) {
//            mid = (start + end) / 2;
//            if (nums[mid] >= target) {
//                end = mid;
//            } else start = mid + 1;
//        }
//        int firstIndex = start;
//
//        start = 0;
//        end = nums.length;
//        while (start < end) {
//            mid = (start + end) / 2;
//            if (nums[mid] > target)
//                end = mid;
//            else
//                start = mid + 1;
//        }
//        int lastIndex = start;
//
//        if (firstIndex >= lastIndex) {
//            return new int[]{-1, -1};
//        }
//        return new int[]{firstIndex, lastIndex - 1};
//    public static int[] findTheHighAndLowIndex(List<Integer> arr, int key) {
//        return new int[]{
//                findLowIndex(arr, 0, arr.size() - 1, key),
//                findHighIndex(arr, 0, arr.size() - 1, key)};
//
//    }
//
//    static int findLowIndex(List<Integer> arr, int low, int high, int key) {
//        if (high < low) return -1;
//        if (high == low) return low;
//        int mid = (low + high) / 2;
//
//
//        if (arr.get(mid) == key && arr.get(mid - 1) != key) return mid;
//
//        if (arr.get(mid) < key) return findLowIndex(arr, mid, high, key);
//
//        return findLowIndex(arr, low, mid, key);
//    }
//
//    public static int findHighIndex(List<Integer> arr, int low, int high, int key) {
//        if (high < low) return -1;
//        if (high == low) return high;
//        int mid = (low + high) / 2;
//
//        if (arr.get(mid) == key && arr.get(mid + 1) != key) return mid;
//
//        if (arr.get(mid) > key) return findHighIndex(arr, low, mid, key);
//
//        return findHighIndex(arr, mid, high, key);
//    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (nums[mid] >= target) end = mid;
            else start = mid + 1;
        }

        int firstIndex = start;
        start = 0;
        end = nums.length;

        while (start < end) {
            mid = (start + end) / 2;

            if (nums[mid] > target) end = mid;
            else start = mid + 1;
        }

        int lastIndex = start;

        if (firstIndex >= lastIndex) {
            return new int[]{-1, -1};
        }

        return new int[]{firstIndex, lastIndex - 1};
    }

}
