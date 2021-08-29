package com.codingChallenge.BasicCalculatorII;

import java.util.Stack;

public class BasicCalculatorII {

    public static int calculate(String s) {
        int currValue = 0;
        int prevValue = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currValue = currValue * 10 + ch - '0';
            }

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(currValue);
                } else if (sign == '-') {
                    stack.push(currValue * -1);
                } else if (sign == '*') {
                    prevValue = stack.pop();
                    stack.push(prevValue * currValue);
                } else if (sign == '/') {
                    prevValue = stack.pop();
                    stack.push(prevValue / currValue);
                }

                currValue = 0;
                sign = ch;
            }
        }

        int ans = 0;

        while (stack.size() > 0) {
            ans += stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
