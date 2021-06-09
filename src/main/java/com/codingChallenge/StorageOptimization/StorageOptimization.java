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
 * Example 1:
 * n = 6
 * m = 6
 * h = [4]
 * v = [2]
 * <p>
 * Consider the diagram below. The left image depicts the initial storage unit with n = 6 horizontal and m = 6 vertical
 * separators, where the volume of the largest storage space is 1 x 1 x 1. The right image depicts that unit after
 * the fourth horizontal and second vertical separators are removed. The maximum storage volume for that unit
 * is then 2 x 2 x 1 = 4 cubic meters.
 * Example 2:
 *  * Input:n = 3 m = 3 h = [2] v = [2]
 *  * Output: 4
 *  * Explanation:
 *  * There are n = m = 3 separators in the vertical and horizontal directions.
 *  * Separators to remove are h = [2] and v = [2]. so the unit looks like this:
 *  * Return the volume of the biggest space, 4, as the answer.
 *  *
 *  * Example 3:
 *  * Input:n = 3 m = 2 h = [1, 2, 3] v = [1, 2]
 *  * Output: 12
 *  * Explanation:
 *  * Initially there are n = 3 horizontal and m = 2 vertical separators.
 *  * Remove separators h = [1, 2, 3] and v = [1,2]. so the unit looks like this:
 *  * The volume of the biggest storage space is 12 cubic meters.
 */
public class StorageOptimization {

    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>() {{
            add(2);
            add(3);
        }};
        List<Integer> v = new ArrayList<>() {{
            add(3);
            add(4);
            add(5);
        }};
        System.out.println(storage(6, 6, h, v));
    }

    /**
     * Time Complexity: O(N * log(N))
     * - Sorting array : O(N * log(N))
     * - Iteration: O(N)
     * Space Complexity: O(1)
     */
    public static int storage(int n, int m, List<Integer> h, List<Integer> v) {
        return (longest(h) + 1) * (longest(v) + 1) ;
    }

    private static int longest(List<Integer> arr) {
        arr.sort(null);

        int last = -1;
        int consec = 0;
        int maxConsec = 0;

        for (int val : arr) {
            if (val != last + 1) {
                consec = 0;
            }
            last = val;
            consec++;
            maxConsec = Math.max(maxConsec, consec);
        }
        return maxConsec;
    }
}
