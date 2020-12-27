package com.codingChallenge.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 4, 5, 9, 12, 14};
        System.out.println(search(new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3}, 3)); // index = 8

//        System.out.println(search(arr, 9));
//        System.out.println(search(arr, 1));

    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);

        if (pivot == -1) return binarySearch(nums, 0, nums.length - 1, target);
        if (nums[pivot] == target) return pivot;
        if (nums[0] <= target) return binarySearch(nums, 0, pivot - 1, target);
        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    public static int findPivot(int[] nums, int low, int high) {
        if (high < low) return -1;

        if (high == low) return low;

        int mid = (low + high) / 2;
        if (mid < high && nums[mid] > nums[mid + 1]) return mid;
        if (mid > low && nums[mid] < nums[mid - 1]) return mid - 1;

        if (nums[low] >= nums[mid]) return findPivot(nums, low, mid - 1);
        else return findPivot(nums, mid + 1, high);
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end) return -1;

        int mid = (start + end) / 2;

        if (nums[mid] == target) return mid;

        if (nums[mid] < target) return binarySearch(nums, mid + 1, end, target);
        else return binarySearch(nums, start, mid - 1, target);
    }
}


