package com.codingChallenge.TopKFrequentWords;

import java.util.*;

public class TopKFrequentWords {

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<String> heap = new PriorityQueue<>(
                (a, b) -> map.get(a).equals(map.get(b)) ? b.compareTo(a) : map.get(a) - map.get(b)
        );

        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            heap.add(entry.getKey());

            if (heap.size() > k) heap.remove();
        }

        for (int i = heap.size() - 1; i >= 0; i--) {
            result.add(heap.remove());
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

    }
}
