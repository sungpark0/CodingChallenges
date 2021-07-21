package com.codingChallenge;

import java.util.*;

/**
 * Group Anagrams
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the
 * letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Edge case:
 * 1. Minimum length of array will be 1
 * 2. If not exact anagram, group it itself
 * 3. Anagram made with a letter used more than once
 * 4. All lowercases
 * <p>
 * Input: str = ["cat, "tac", "pig", "tug" "gut"]
 * Output: [["cat", "act], ["pig"], ["tug, "gut]]
 * <p>
 * Input = Array of strings
 * Output = List of List of Strings
 */

public class MockInterviewI {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"cat", "tac", "pig", "tug", "gut"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String sortedStr = new String(ch);

            List<String> list = map.getOrDefault(sortedStr, new ArrayList<>());
            list.add(str);

            map.put(sortedStr, list);
        }

        return new ArrayList(map.values());

        // Placeholder list


        // iterate through strs
            // build int[] of characters new int[26]



    }
}
