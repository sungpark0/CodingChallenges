package com.codingChallenge.QuickSort;

import java.util.Arrays;

public class LastPivotQuickSort {

    public static void quickSortLastPivot(int[] nums, int low, int high) {
        if (low < high) {
            int partition = partitionLast(nums, low, high);

            quickSortLastPivot(nums, low, partition - 1);
            quickSortLastPivot(nums, partition + 1, high);
        }
    }

    public static int partitionLast(int[] nums, int low, int high) {
        int pivot = nums[high];
        int leftIndex = low - 1;
        int rightIndex = low;

        while (rightIndex < high) {
            if (nums[rightIndex] < pivot) {
                leftIndex++;
                swap(nums, leftIndex, rightIndex);
            }
            rightIndex++;
        }

        swap(nums, leftIndex + 1, high);

        return leftIndex + 1;
    }

    public static void swap(int[] nums, int leftIndex, int rightIndex) {
        int temp = nums[leftIndex];
        nums[leftIndex] = nums[rightIndex];
        nums[rightIndex] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{13, 17, 7, 3, 20, 2, 9, 1, 8, 12, 15};
        quickSortLastPivot(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
