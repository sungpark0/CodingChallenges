package com.codingChallenge;

import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 * <p>
 * picture: https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons)
 * is given below. Note that 1 does not map to any letters.
 * <p>
 * Example 1:
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * <p>
 * // Input: String
 * // Output: List<String>
 * <p>
 * // Edge cases:
 * - If String is empty, return empty List<String>
 * - Digit could be a repeat numbers from 2 - 9.
 * - Give the answers based on the order of the String
 * <p>
 * // Example:
 * - Input: String = "28"
 * - Output: ["at", "au", "av", "bt", "bu", "bv", "ct", "cu", "cv"]
 * <p>
 * - map -> key = string of numbers , value = corresponding string of letters for the number
 * - create a helper method (recursion)
 * - base case = index == digits.length() return list;
 * - get string of letters from the map
 * - iteration
 * - add to the list
 * - recurse
 * - remove the last character in the combination list.
 */

public class MockInterviewII {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) return combinations;

        return helper(map, digits, combinations, 0, new ArrayList<>());
    }

    public static List<String> helper(Map<Character, String> map, String digits, List<String> list, int index, List<String> sb) {
        if (index == digits.length()) {
            list.add(String.join("", sb));
            return list;
        }

        // input = "234"
        // output = [adg, ae, af, bd, be, bf, cd, ce, cf]
        // 'abc'
        String str = map.get(digits.charAt(index)); //"abc"

        for (int i = 0; i < str.length(); i++) { //"tuv"
            sb.add(String.valueOf(str.charAt(i)));
            helper(map, digits, list, index + 1, sb);
            sb.remove(sb.size() - 1);
        }

        return list;
    }


}
