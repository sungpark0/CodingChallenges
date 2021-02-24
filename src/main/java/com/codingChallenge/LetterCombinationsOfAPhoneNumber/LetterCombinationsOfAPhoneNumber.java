package com.codingChallenge.LetterCombinationsOfAPhoneNumber;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    static Map<Character, String> map = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;

        return helper(digits, result, new char[digits.length()], 0);
    }

    public static List<String> helper(String digits, List<String> result, char[] temp, int index) {
        if (digits.length() == index) {
            result.add(new String(temp));
            return result;
        }

        char ch = digits.charAt(index);
        for (int i = 0; i < map.get(ch).length(); i++) {
            temp[index] = map.get(ch).charAt(i);
            helper(digits, result, temp, index + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}