package com.codingChallenge.GroupAnagram;

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String sortedStr = new String(ch);

            List<String> list = map.getOrDefault(sortedStr, new ArrayList<>());
            list.add(str);

            map.put(sortedStr, list);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            group.add(entry.getValue());
        }

        return group;
    }

    public static void main(String[] args) {

    }
}
