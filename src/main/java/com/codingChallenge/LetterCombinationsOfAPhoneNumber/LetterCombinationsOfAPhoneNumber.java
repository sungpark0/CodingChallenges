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

    public static List<String> letterCombinationsII(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) return combinations;

        StringBuilder sb = new StringBuilder();


        helperII(combinations, digits, sb, 0);

        return combinations;
    }

    public static void helperII(List<String> list, String digits, StringBuilder sb, int index) {
        if (digits.length() == index) {
            list.add(sb.toString());
            return;
        }

        String curr = map.get(digits.charAt(index));

        for (int i = 0; i < curr.length(); i++) {
            sb.append(curr.charAt(i));
            helperII(list, digits, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static List<String> letterCombinationsIII(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) return result;

        StringBuilder sb = new StringBuilder();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        return helperIII(map, digits, result, sb, 0);
    }

    public static List<String> helperIII(Map<Character, String> map, String digits, List<String> result, StringBuilder sb, int index) {
        if (digits.length() == index) {
            result.add(sb.toString());
            return result;
        }

        char ch = digits.charAt(index);

        for (int i = 0; i < map.get(ch).length(); i++) {
            sb.append(map.get(ch).charAt(i));
            helperIII(map, digits, result, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}