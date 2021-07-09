package com.codingChallenge.FindMinimumInRotatedSortedArray;

import java.util.PriorityQueue;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);

        for (int num : nums) {
            minHeap.add(num);
        }

        return minHeap.remove();
    }

    public static void main(String[] args) {

    }
}
