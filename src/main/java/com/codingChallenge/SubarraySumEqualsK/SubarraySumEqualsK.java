package com.codingChallenge.SubarraySumEqualsK;

import java.util.*;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        int counter = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                counter += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return counter;
    }

    public static void main(String[] args) {

    }
}
