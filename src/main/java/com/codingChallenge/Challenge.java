package com.codingChallenge;

import java.util.*;

/**
 * Given a non-empty list of words, return the k most frequent elements.
 * <p>
 * Your answer should be sorted by frequency from highest to lowest.
 * If two words have the same frequency, then the word with the lower alphabetical order comes first.
 * <p>
 * Example 1:
 * Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * Output: ["i", "love"]
 * Explanation: "i" and "love" are the two most frequent words.
 * Note that "i" comes before "love" due to a lower alphabetical order.
 * Example 2:
 * Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * Output: ["the", "is", "sunny", "day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
 * with the number of occurrence being 4, 3, 2 and 1 respectively.
 */
public class Challenge {

    public static List<String> frequentElements(List<String> words, int k) {
        // Final list
        List<String> list = new ArrayList<>();

        // Map of words and the corresponding counter
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) map.put(word, map.get(word) + 1);
            else map.put(word, 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> map.get(a).equals(map.get(b)) ? a.compareTo(b) : map.get(b) - map.get(a));

        for (Map.Entry<String, Integer> ent : map.entrySet()) {
            heap.add(ent.getKey());
        }

        while (k > 0) {
            list.add(heap.remove());
            k--;
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(frequentElements(List.of("i", "love", "leetcode", "i", "love", "coding"), 2));
        System.out.println("Correct answer should be : [\"i\", \"love]");
        System.out.println(frequentElements(List.of("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"), 4));
        System.out.println("Correct answer should be : [\"the\", \"is\", \"sunny\", \"day\"]");
        System.out.println(frequentElements(List.of("i", "love", "leetcode", "i", "love", "coding"), 3));
        System.out.println("Correct answer should be : [\"i\",\"love\",\"coding\"] ");

    }
}
