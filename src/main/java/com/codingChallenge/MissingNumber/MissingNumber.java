package com.codingChallenge.MissingNumber;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return (nums.length * (nums.length + 1) / 2) - sum;
    }

    public static void main(String[] args) {

    }
}
