package com.codingChallenge.MoveZeroes;

import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] test = {0, 1, 0, 3, 12};
        moveZeroesII(test);
    }

    public void moveZeroesIII(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }

    }

    public static void moveZeroesII(int[] nums) {
        int counter = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) counter++;
            else nums[index++] = nums[i];
        }

        for (int i = nums.length - 1; i > nums.length - 1 - counter; i--) {
            nums[i] = 0;
        }
    }

    public static int[] moveZeroes(int[] nums) {
        int counter = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int num : nums) {
            if (num == 0) counter++;
            else queue.add(num);
        }

        int j = 0;
        while (!queue.isEmpty()) {
            nums[j] = queue.remove();
            j++;
        }

        j = nums.length - 1;
        for (int i = 0; i < counter; i++) {
            nums[j] = 0;
            j--;
        }

        return nums;
    }
}
