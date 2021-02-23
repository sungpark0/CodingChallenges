package com.codingChallenge.Permutation;

import java.util.*;

public class Permutation {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        helper(result, new ArrayList<>(), nums);

        return result;
    }

    public static void helper(List<List<Integer>> result, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int num : nums) {
            if (temp.contains(num)) continue;
            temp.add(num);
            helper(result, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
