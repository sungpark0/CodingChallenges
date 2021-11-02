package com.codingChallenge.Citadel;

import java.util.*;

/**
 * Given an array of n distinct integers, d = [d[0], d[1], ..., d[n - 1], and an integer threshold, t, how many (a, b, c)
 * index triplets exists that satisfy both of the following conditions?
 * <p>
 * - d[a] < d[b] < d[c]
 * - d[a] + d[b] + d[c] <= t
 * <p>
 * Example:
 * d = [1, 2, 3, 4, 5]
 * t = 8
 * <p>
 * The following 4 triplets satisfy the constraints:
 * (1, 2, 3) -> 1 + 2 + 3 = 6 <= 8
 * (1, 2, 4) -> 1 + 2 + 4 = 7 <= 8
 * (1, 2, 5) -> 1 + 2 + 5 = 8 <= 8
 * (1, 3, 4) -> 1 + 3 + 4 = 8 <= 8
 * <p>
 * Function description
 * Complete the function triplets in the editor below.
 * <p>
 * triplets has the following parameter(s):
 * int t : an integer threshold
 * int d[n] : an array of integers
 * <p>
 * returns:
 * long : a long that denotes the number of (a, b, c) triplets that satisfy the given condition
 */

public class Triplets {

    public static long triplets(long t, List<Integer> d) {
        Collections.sort(d);

        long ans = 0;

        for (int i = 0; i < d.size(); i++) {
            int j = i + 1;
            int k = d.size() - 1;
            while (j < k) {
                if (d.get(i) + d.get(j) + d.get(k) > t) k--;
                else {
                    ans += k - j;
                    j++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) list.add(i);

        System.out.println(triplets(8, list));
    }
}
