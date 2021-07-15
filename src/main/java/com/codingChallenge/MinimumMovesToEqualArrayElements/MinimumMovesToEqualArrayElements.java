package com.codingChallenge.MinimumMovesToEqualArrayElements;

public class MinimumMovesToEqualArrayElements {

    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minMoves = 0;

        for (int num : nums) {
            min = Math.min(min, num);
        }

        for (int num : nums) {
            minMoves += num - min;
        }

        return minMoves;
    }

    public static void main(String[] args) {

    }
}
