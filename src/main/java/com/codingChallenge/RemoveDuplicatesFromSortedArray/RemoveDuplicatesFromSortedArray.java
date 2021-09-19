package com.codingChallenge.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int k = 0;

        for (int num : nums) {
            if (k == 0 || nums[k - 1] < num) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

    }
}
