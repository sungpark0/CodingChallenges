package com.codingChallenge.ReorganizeString;

import java.util.*;

public class ReorganizeString {

    public static String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        heap.addAll(map.keySet());

        while (heap.size() > 1) {
            char first = heap.remove();
            char next = heap.remove();
            result.append(first);
            result.append(next);
            map.put(first, map.get(first) - 1);
            map.put(next, map.get(next) - 1);

            if (map.get(first) > 0) {
                heap.add(first);
            }

            if (map.get(next) > 0) {
                heap.add(next);
            }
        }

        if (!heap.isEmpty()) {
            char last = heap.remove();
            if (map.get(last) > 1) {
                return "";
            }
            result.append(last);

        }
        return result.toString();

    }

    public static void main(String[] args) {

    }
}
