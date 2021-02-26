package com.codingChallenge.Combinations;

import java.util.*;

public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(result, n, k, 1, temp);

        return result;
    }

    public static void helper(List<List<Integer>> result, int n, int k, int currIndex, List<Integer> temp) {

        if (temp.size() == k) {
            result.add(new ArrayList(temp));
            return;
        }

        while (currIndex <= n) {
            temp.add(currIndex);
            helper(result, n, k, currIndex + 1, temp);
            temp.remove(temp.size() - 1);
            currIndex++;
        }
    }

    public static void main(String[] args) {

        combine(4,2);
    }
}
