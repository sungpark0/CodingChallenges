package com.codingChallenge.MergeSort;

import java.util.Arrays;

public class MergeSort {

//    public static void mergeSort(int[] nums, int low, int high) {
//        if (low < high) {
//            int mid = (low + high) / 2;
//
//            mergeSort(nums, low, mid);
//            mergeSort(nums, mid + 1, high);
//
//            merge(nums, low, mid, high);
//        }
//    }

//    public static void merge(int[] nums, int low, int mid, int high) {
//        int[] leftArr = Arrays.copyOfRange(nums, low, mid + 1); // copy left side of the array
//        int[] rightArr = Arrays.copyOfRange(nums, mid + 1, high + 1); // copy right side of the array
//
//        int leftIndex = 0;
//        int rightIndex = 0;
//
//        while (low < high + 1) {
//            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
//                if (leftArr[leftIndex] < rightArr[rightIndex]) {
//                    nums[low] = leftArr[leftIndex];
//                    leftIndex++;
//                } else {
//                    nums[low] = rightArr[rightIndex];
//                    rightIndex++;
//                }
//            } else if (leftIndex < leftArr.length) {
//                nums[low] = leftArr[leftIndex];
//                leftIndex++;
//            } else if (rightIndex < rightArr.length) {
//                nums[low] = rightArr[rightIndex];
//                rightIndex++;
//            }
//            low++;
//        }
//    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);

            merge(nums, low, mid, high);
        }

    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] leftArray = Arrays.copyOfRange(nums, low, mid + 1); //stops at 1 before the to
        int[] rightArray = Arrays.copyOfRange(nums, mid + 1, high + 1); // since we need to include the last element in the array we need to put to as high + 1

        int leftIndex = 0;
        int rightIndex = 0;

        while (low < high + 1) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    nums[low] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    nums[low] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                nums[low] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                nums[low] = rightArray[rightIndex];
                rightIndex++;
            }
            low++;
        }
    }

    public static int[] sortArrayII(int[] nums) {

        if(nums.length == 1 ) return nums;

        int pivot = nums.length / 2;

        int[] leftArr = sortArrayII(Arrays.copyOfRange(nums, 0, pivot));
        int[] rightArr = sortArrayII(Arrays.copyOfRange(nums, pivot, nums.length));

        return mergeII(leftArr, rightArr);
    }

    public static int[] mergeII(int[] leftArr, int[] rightArr){
        int[] newArr = new int[leftArr.length + rightArr.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int newIndex = 0;

        while(leftIndex < leftArr.length && rightIndex< rightArr.length){
            if(leftArr[leftIndex] < rightArr[rightIndex]){
                newArr[newIndex++] = leftArr[leftIndex++];
            } else{
                newArr[newIndex++] = rightArr[rightIndex++];
            }
        }

        while(leftIndex < leftArr.length){
            newArr[newIndex++] = leftArr[leftIndex++];
        }

        while(rightIndex < rightArr.length){
            newArr[newIndex++] = rightArr[rightIndex++];
        }

        return newArr;
    }


    public static void main(String[] args) {
        MergeSort temp = new MergeSort();
        int[] nums = new int[]{4, 7, 12, 32, 18, 1, 23, 17};
        temp.mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }


}
