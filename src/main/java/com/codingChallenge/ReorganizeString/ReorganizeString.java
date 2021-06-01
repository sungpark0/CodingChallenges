package com.codingChallenge.ReorganizeString;

import java.util.*;

/**
 * Given a string s, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.
 * <p>
 * If possible, output any possible result.  If not possible, return the empty string.
 * <p>
 * Example 1: Input s = "aab"
 * Output: "aba"
 * <p>
 * Example 2: Input s = "aaab"
 * Output: ""
 */
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

    public String reorganizeStringII(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        heap.addAll(map.keySet());

        while (heap.size() > 1) {
            char first = heap.remove();
            char second = heap.remove();
            sb.append(first);
            sb.append(second);
            map.put(first, map.get(first) - 1);
            map.put(second, map.get(second) - 1);

            if (map.get(first) > 0) {
                heap.add(first);
            }
            if (map.get(second) > 0) {
                heap.add(second);
            }
        }

        while (!heap.isEmpty()) {
            char last = heap.remove();
            if (map.get(last) > 1) return "";
            sb.append(last);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aab"));
        System.out.println(reorganizeString("aaab"));
    }
}
