package com.codingChallenge.QuickSort;

import java.util.Arrays;

public class MiddlePivotQuickSort {

//    public static void quickSortMiddlePivot(int[] nums, int low, int high) {
//        if (low < high) {
//            int pivotIndex = partitionMiddle(nums, low, high);
//
//            quickSortMiddlePivot(nums, low, pivotIndex);
//            quickSortMiddlePivot(nums, pivotIndex + 1, high);
//        }
//    }
//
//    public static int partitionMiddle(int[] nums, int low, int high) {
//        //This is not needed for last element pivot point QuickSort
//        int middleIndex = (high + low) / 2;
//        swap(nums, middleIndex, high);
//        //
//
//        int pivot = nums[high];
//        int leftIndex = low;
//        int rightIndex = high - 1;
//
//        while (leftIndex < rightIndex) {
//            while (nums[leftIndex] < pivot && leftIndex < rightIndex) leftIndex++;
//            while (nums[rightIndex] > pivot && leftIndex < rightIndex) rightIndex--;
//
//            if (nums[leftIndex] > nums[rightIndex]) {
//                swap(nums, leftIndex, rightIndex);
//                leftIndex++;
//            }
//            rightIndex--;
//        }
//
//        if (nums[leftIndex] > nums[high]) swap(nums, leftIndex, high);
//
//        return leftIndex;
//    }
//
//    public static void swap(int[] nums, int leftIndex, int rightIndex) {
//        int temp = nums[leftIndex];
//        nums[leftIndex] = nums[rightIndex];
//        nums[rightIndex] = temp;
//    }

    public static void quickSortMiddlePivot(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = partitionMiddle(nums, low, high);

            quickSortMiddlePivot(nums, low, pivot);
            quickSortMiddlePivot(nums, pivot + 1, high);
        }
    }

    public static int partitionMiddle(int[] nums, int low, int high) {
        int middle = (low + high) / 2;
        swap(nums, middle, high);

        int pivot = nums[high];
        int leftIndex = low;
        int rightIndex = high - 1;

        while (leftIndex < rightIndex) {
            while (nums[leftIndex] < pivot && leftIndex < rightIndex) leftIndex++;
            while (nums[rightIndex] > pivot && leftIndex < rightIndex) rightIndex--;

            if (nums[leftIndex] > nums[rightIndex]) {
                swap(nums, leftIndex, rightIndex);
                leftIndex++;
            }
            rightIndex--;
        }

        if (nums[leftIndex] > nums[high]) swap(nums, leftIndex, high);

        return leftIndex;
    }

    public static void swap(int[] nums, int leftIndex, int rightIndex) {
        int temp = nums[rightIndex];
        nums[rightIndex] = nums[leftIndex];
        nums[leftIndex] = temp;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{13, 17, 7, 3, 20, 2, 9, 1, 8, 12, 15};
        quickSortMiddlePivot(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
