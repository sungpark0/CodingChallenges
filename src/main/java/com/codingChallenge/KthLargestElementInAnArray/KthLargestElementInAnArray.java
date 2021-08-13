package com.codingChallenge.KthLargestElementInAnArray;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        return minHeap.peek();
    }

    public static int findKthLargestII(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.add(num);
        }

        for (int i = 1; i < k; i++) {
            maxHeap.remove();
        }

        return maxHeap.remove();
    }

    public static void main(String[] args) {

    }
}
