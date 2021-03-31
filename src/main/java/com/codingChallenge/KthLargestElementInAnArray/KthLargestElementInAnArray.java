package com.codingChallenge.KthLargestElementInAnArray;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

    }
}
