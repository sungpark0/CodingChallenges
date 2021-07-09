package com.codingChallenge.FirstUniqueCharacterInAString;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {
        int[] frequency = new int[26];

        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (frequency[ch - 'a'] == 1) {
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
