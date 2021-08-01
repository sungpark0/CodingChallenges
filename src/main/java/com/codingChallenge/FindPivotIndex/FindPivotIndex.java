package com.codingChallenge.FindPivotIndex;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int targetNumber = 0;

        for (int num : nums) {
            targetNumber += num;
        }

        int total = 0;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            targetNumber -= nums[i];

            if (total == targetNumber) {
                index = i;
                break;
            }

            total += nums[i];
        }

        return index;
    }

    public static void main(String[] args) {

    }
}
