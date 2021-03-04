package com.codingChallenge.MoveZeroes;

import java.util.*;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] test = {0, 1, 0, 3, 12};
        moveZeroesII(test);
    }

    public static void moveZeroesII(int[] nums) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) {
                counter++;
            } else {
                result.add(num);
            }
        }
        for (int i = 0; i < counter; i++) {
            result.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result.get(i);
        }

    }

    public static void moveZeroes(int[] nums) {
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
}
