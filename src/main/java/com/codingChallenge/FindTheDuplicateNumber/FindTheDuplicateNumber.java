package com.codingChallenge.FindTheDuplicateNumber;

import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) return num;
            map.put(num, 1);
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
