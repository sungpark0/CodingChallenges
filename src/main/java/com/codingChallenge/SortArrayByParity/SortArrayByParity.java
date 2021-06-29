package com.codingChallenge.SortArrayByParity;

import java.util.*;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        int index = 0;

        for (int num : nums) {
            if (num % 2 == 0) evens.add(num);
            else odds.add(num);
        }

        for (int i = 0; i < evens.size(); i++) {
            nums[i] = evens.get(i);
            index++;
        }

        for (Integer odd : odds) {
            nums[index] = odd;
            index++;
        }

        return nums;
    }

    public static void main(String[] args) {

    }
}
