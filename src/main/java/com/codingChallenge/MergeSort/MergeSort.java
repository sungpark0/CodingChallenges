package com.codingChallenge.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);

            merge(nums, low, mid, high);
        }
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] leftArr = Arrays.copyOfRange(nums, low, mid + 1); // copy left side of the array
        int[] rightArr = Arrays.copyOfRange(nums, mid + 1, high + 1); // copy right side of the array

        int leftIndex = 0;
        int rightIndex = 0;

        while (low < high + 1) {
            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]) {
                    nums[low] = leftArr[leftIndex];
                    leftIndex++;
                } else {
                    nums[low] = rightArr[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArr.length) {
                nums[low] = leftArr[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArr.length) {
                nums[low] = rightArr[rightIndex];
                rightIndex++;
            }
            low++;
        }
    }


    public static void main(String[] args) {
        MergeSort temp = new MergeSort();
        int[] nums = new int[]{4, 7, 12, 32, 1, 23, 17};
        temp.mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
