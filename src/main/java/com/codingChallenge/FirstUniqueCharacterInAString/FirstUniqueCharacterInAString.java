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

    public static int firstUniqCharII(String s) {
        int index = -1;
        int[] letters = new int[26];

        for (char ch : s.toCharArray()) {
            letters[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (letters[s.charAt(i) - 'a'] == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {

    }
}
