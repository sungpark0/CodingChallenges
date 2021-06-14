package com.codingChallenge.WordLadder;

import java.util.*;

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        Set<String> words = new HashSet<>(wordList);
        words.remove(beginWord);

        int length = 0;
        while (!queue.isEmpty()) {
            length++;
            int size = queue.size();
            while (size > 0) {
                String word = queue.remove();
                if (word.equals(endWord)) {
                    return length;
                }

                for (int i = 0; i < word.length(); i++) {
                    String prefix = word.substring(0, i);
                    String suffix = word.substring(i + 1, word.length());
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        String candidate = prefix + ch + suffix;
                        if (words.remove(candidate)) {
                            queue.add(candidate);
                        }
                    }
                }
                size--;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
