package com.codingChallenge.MergeIntervals;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> intervalsList = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                intervalsList.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }

        intervalsList.add(new int[]{start, end});

        return intervalsList.toArray(new int[intervalsList.size()][2]);
    }

    public static void main(String[] args) {

    }
}
