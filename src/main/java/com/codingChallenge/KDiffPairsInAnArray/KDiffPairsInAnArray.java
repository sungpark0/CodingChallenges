package com.codingChallenge.KDiffPairsInAnArray;

import java.util.*;

public class KDiffPairsInAnArray {

    public static int findPairs(int[] nums, int k) {
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.containsKey(entry.getKey() + k) && k > 0) {
                counter++;
            } else if (k == 0 && entry.getValue() > 1) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
