package com.codingChallenge.TopKFrequentElement;

import java.util.*;

public class TopKFrequentElement {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                nums.length, (a, b) -> map.get(a) - map.get(b));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(entry.getKey());

            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        int[] result = new int[minHeap.size()];

        for (int i = minHeap.size() - 1; i >= 0; i--) {
            result[i] = minHeap.remove();
        }

        return result;
    }

    public static int[] topKFrequentII(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(entry.getKey());
        }

        for (int i = 0; i < k; i++) {
            arr[i] = minHeap.remove();
        }

        return arr;
    }

    public static void main(String[] args) {

    }
}
