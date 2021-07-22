package com.codingChallenge.CircularArrayLoop;

import java.util.*;

public class CircularArrayLoop {

    public static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> visited = new HashSet<>();
            int current = i;
            int count = 0;
            while (!set.contains(current) && !visited.contains(current)) {
                if (nums[current] * (nums[i] > 0 ? 1 : -1) < 0 || Math.abs(nums[current]) == n) {
                    set.addAll(visited);
                    break;
                }

                visited.add(current);
                current = ((current + nums[current]) % n + n) % n;
                count++;

                if (visited.contains(current)) {
                    if (count > 1) return true;
                    else break;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
