package com.codingChallenge.ConcatenatedWords;

import java.util.*;

public class ConcatenatedWords {
    public static List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();

        Collections.addAll(set, words);

        for (String word : words) {
            if (helper(word, set)) {
                result.add(word);
            }
        }

        return result;
    }

    public static boolean helper(String s, Set<String> set) {
        int len = s.length();
        if (len == 0) return false;

        boolean[] dp = new boolean[len + 1];
        dp[0] = true;

        for (int i = 0; i <= len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (i == len && j == 0) continue;

                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len];
    }

    public static void main(String[] args) {

    }
}
