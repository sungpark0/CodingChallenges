package com.codingChallenge.LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                longest = Math.max(longest, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

    }
}
