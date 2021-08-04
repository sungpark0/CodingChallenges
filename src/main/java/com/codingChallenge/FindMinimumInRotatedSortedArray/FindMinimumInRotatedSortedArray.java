package com.codingChallenge.FindMinimumInRotatedSortedArray;

import java.util.PriorityQueue;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);

        for (int num : nums) {
            minHeap.add(num);
        }

        return minHeap.remove();
    }

    public static int findMinII(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        if (nums[left] < nums[right]) return nums[left];

        while(left < right){
            int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[0]) left = mid + 1;
            else if (nums[mid] < nums[0]) right = mid;
        }

        return Math.min(nums[left], nums[right]);
    }

    public static void main(String[] args) {

    }
}
