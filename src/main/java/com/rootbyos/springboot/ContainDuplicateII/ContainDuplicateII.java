package com.rootbyos.springboot.ContainDuplicateII;

import java.util.*;
import java.util.stream.Collectors;

public class ContainDuplicateII {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1, 2, 3};
        int[] test = {1, 2, 3, 1};
        //            0  1  2  3  4  5
        System.out.println(containsNearbyDuplicate(test, 3));
        System.out.println(containNearbyDuplicateII(test, 3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 6);
        integers.stream()
                .filter(x -> x > 2)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(integers);

    }

    public static boolean containNearbyDuplicateII(int[] nums, int k) {

        for (int i = 0; i < nums.length - 1; i++) {
            int scopeIndex = Math.min(i + 1 + k, nums.length);
            for (int j = i + 1; j < scopeIndex; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }




    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length - 1; i++) {
            int scopeIndex = Math.min(i + 1 + k, nums.length);
            for (int j = i + 1; j < scopeIndex; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicateTwo(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
