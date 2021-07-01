package com.codingChallenge.SummaryRanges;

import java.util.*;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> smallestString = new ArrayList<>();

        int start = 0;
        while (start < nums.length) {
            int end = start + 1;
            StringBuilder sb = new StringBuilder();
            while (end < nums.length && nums[end] - nums[start] == end - start) end++;
            if (end == start + 1) sb.append(nums[start]);
            else sb.append(nums[start] + "->" + nums[end - 1]);
            smallestString.add(sb.toString());
            start = end;
        }

        return smallestString;
    }

    public static void main(String[] args) {

    }
}
