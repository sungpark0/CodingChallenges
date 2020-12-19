package com.codingChallenge.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 4, 5, 9, 12, 14};
        System.out.println(search(arr, 9));
        System.out.println(search(arr, 1));

    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end) return -1;

        int mid = (start + end) / 2;

        if (nums[mid] == target) return mid;

        else if (nums[mid] < target) return binarySearch(nums, mid + 1, end, target);

        else return binarySearch(nums, start, mid - 1, target);
    }
}


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = findFirstIndex();
        int lastIndex = findLastIndex();


        return new int[] {firstIndex, lastIndex};

    }


    public static int findFirstIndex() {
        
    }

    public static int findLastIndex() {

    }
}
