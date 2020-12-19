package com.codingChallenge.ValidParenthesisString;

import java.util.*;

public class ValidParenthesesString {
    public static void main(String[] args) {

        String test = "()";

        System.out.println(checkValidString(test));

    }

    public static boolean checkValidString(String s) {
        List<Integer> left = new ArrayList<>();
        List<Integer> asterisk = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == '(') {
                left.add(i);
            } else if (ch == '*') {
                asterisk.add(i);
            } else {
                if (left.isEmpty() && asterisk.isEmpty()) {
                    return false;
                } else if (left.isEmpty()) {
                    asterisk.remove(asterisk.size() - 1);
                } else {
                    left.remove(left.size() - 1);
                }
            }
        }
        while (left.size() > 0 && asterisk.size() > 0) {
            if (asterisk.get(asterisk.size() - 1) < left.get(left.size() - 1)) {
                break;
            }
            asterisk.remove(asterisk.size() - 1);
            left.remove(asterisk.size() - 1);
        }
        return left.isEmpty();
    }
}
