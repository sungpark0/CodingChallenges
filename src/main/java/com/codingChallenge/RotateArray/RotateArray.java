package com.codingChallenge.RotateArray;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];
        k = k % nums.length;

        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }

        int j = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            nums[j] = nums[i];
            j++;
        }

        for (int i = 0; i < nums.length - k; i++) {
            nums[j] = copy[i];
            j++;
        }
    }

    public static void main(String[] args) {

    }
}
