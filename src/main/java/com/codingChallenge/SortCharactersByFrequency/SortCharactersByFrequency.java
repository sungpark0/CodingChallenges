package com.codingChallenge.SortCharactersByFrequency;

import java.util.*;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> map.get(a).equals(map.get(b)) ? map.get(a).compareTo(map.get(b)) : map.get(b).compareTo(map.get(a)));

        heap.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        while (!heap.isEmpty()) {
            char ch = heap.remove();
            int size = map.get(ch);

            for (int i = 0; i < size; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
