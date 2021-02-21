package com.codingChallenge.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        if (n == 1) return List.of("()");

        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        parenthesesHelper(result, n, 0, 0, 0, sb);

        return result;
    }

    public static void parenthesesHelper(List<String> result, int n, int open, int close, int checker, StringBuilder temp) {
        if (temp.length() == n * 2) {
            result.add(temp.toString());
            return;
        }

        if (open < n && temp.length() < n * 2 && checker >= 0) {
            temp.append("(");
            parenthesesHelper(result, n, open + 1, close, checker + 1, temp);
            temp.deleteCharAt(temp.length() - 1);
        }

        if (close < n && temp.length() < n * 2 && checker > 0) {
            temp.append(")");
            parenthesesHelper(result, n, open, close + 1, checker - 1, temp);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
