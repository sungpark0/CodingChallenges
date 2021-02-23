package com.codingChallenge.LetterCombinationsOfAPhoneNumber;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) return result;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder sb = new StringBuilder();

        helper(digits, result, map, sb, 0);

        return result;
    }

    public static void helper(String digits, List<String> result, Map<Character, String> map, StringBuilder temp, int index) {
        if (digits.length() == index) {
            result.add(temp.toString());
        } else {
            String letters = map.get(digits.charAt(index));
            for (int i = 0; i < letters.length(); i++) {
                char letter = letters.charAt(i);
                temp.append(letters);
                helper(digits, result, map, temp, index + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}