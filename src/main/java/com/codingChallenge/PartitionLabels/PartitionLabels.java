package com.codingChallenge.PartitionLabels;

import java.util.*;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] indexes = new int[26];
        char[] sChar = s.toCharArray();

        for (int i = 0; i < s.length(); i++) indexes[sChar[i] - 'a'] = i;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, indexes[sChar[i] - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
