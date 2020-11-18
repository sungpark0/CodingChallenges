package com.rootbyos.springboot.ValidParentheses;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String test = "()";
        System.out.println(isValid(test));
        String test1 = "(]";
        System.out.println(isValid(test1));
        String test2 = "{[]}";
        System.out.println(isValid(test2));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] sArr = s.toCharArray();
        Map<Character, Character> map = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );

        for (char ch : sArr) {
            if (map.containsKey(ch)) {
                stack.push(map.get(ch));
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValidII(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
                '}', '{',
                ')', '(',
                ']', '['
        );

        for (Character ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                if (!map.containsKey(ch)) {
                    stack.push(ch);
                } else {
                    return false;
                }
            } else {
                if (stack.lastElement() == map.get(ch)) {
                    stack.pop();
                } else if (!map.containsKey(ch)) {
                    stack.push(ch);
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

