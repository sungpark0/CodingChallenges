package com.codingChallenge.ContainerWithMostWater;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length - 1;

        while (start < end) {
            max = Math.max(max, (Math.min(height[start], height[end]) * (end - start)));
            if (height[start] < height[end]) start++;
            else end--;
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
