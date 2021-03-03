package com.codingChallenge.MajorityElement;

import java.util.*;
import java.util.stream.Collectors;

public class MajorityElement {

    public static void main(String[] args) {

        int[] test = {1, 1, 1, 4, 1};

        System.out.println((majorityElement(test)));
        System.out.println(majorityElementTwo(test));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> mapElements = new HashMap<>();

        for (int num : nums) {
            if (mapElements.containsKey(num)) {
                mapElements.put(num, mapElements.get(num) + 1);
            } else {
                mapElements.put(num, 1);
            }
        }

        return mapElements.entrySet()
                .stream()
                .filter(i -> i.getValue() > (nums.length / 2))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).get(0);
    }

    public static int majorityElementTwo(int[] nums) {

        Arrays.sort(nums);
        int length = nums.length / 2;

        return nums[length];
    }

    public static int majorityElementThree(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
