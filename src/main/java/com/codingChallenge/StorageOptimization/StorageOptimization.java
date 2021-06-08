package com.codingChallenge.StorageOptimization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Amazon is experimenting with a flexible storage system for their warehouses. The storage unit consists of a
 * shelving system which is one meter deep with removable vertical and horizontal separators. When all separators are
 * installed, each storage space is one cubic meter (1' X 1' X 1'). Determine the volume of the largest space when a
 * series of horizontal and vertical separators are removed.
 * <p>
 * Example:
 * n = 6
 * m = 6
 * h = [4]
 * v = [2]
 * <p>
 * Consider the diagram below. The left image depicts the initial storage unit with n = 6 horizontal and m = 6 vertical
 * separators, where the volume of the largest storage space is 1 x 1 x 1. The right image depicts that unit after
 * the fourth horizontal and second vertical separators are removed. The maximum storage volume for that unit
 * is then 2 x 2 x 1 = 4 cubic meters.
 */
public class StorageOptimization {

    public static long storage(int n, int m, List<Integer> h, List<Integer> v) {
        Collections.sort(h);
        Collections.sort(v);

    }

    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(4);
        List<Integer> v = new ArrayList<>();
        v.add(2);

        System.out.println(storage(6, 6, h, v));
    }
}
