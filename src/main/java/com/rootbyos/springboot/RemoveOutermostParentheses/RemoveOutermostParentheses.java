package com.rootbyos.springboot.RemoveOutermostParentheses;

import java.util.*;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {

        String test = "(()())(())";
        String testIndex = "( ( ) ( ) ) ( ( ) )";
        //                  0 1 2 3 4 5 6 7 8 9
        System.out.println(removeOuterParentheses(test) + " should be ()()()");
        System.out.println(removeOuterParenthesesII(test));

    }

    public static String removeOuterParentheses(String S) {

        StringBuilder str = new StringBuilder();
        int matches = 0;
        for (char ch : S.toCharArray())
            if (ch == '(') {
                if (matches != 0) {
                    str.append(ch);
                }
                matches++;
            } else if (ch == ')') {
                matches--;
                if (matches != 0) {
                    str.append(ch);
                }
            }

        return str.toString();
    }

    public static String removeOuterParenthesesII(String S) {
        char[] sChar = S.toCharArray();
        StringBuilder str = new StringBuilder();
        int index = 0;
        int matches = 0;

        for (int i = 0; i < S.length(); i++) {
            if (sChar[i] == '(') {
                matches++;
            } else if (sChar[i] == ')') {
                matches--;
            }
            if (matches == 0) {
                str.append(S.substring(index + 1, i));
                index = i + 1;
            }
        }
        return str.toString();
    }
}
