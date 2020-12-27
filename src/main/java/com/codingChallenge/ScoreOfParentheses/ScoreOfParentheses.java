package com.codingChallenge.ScoreOfParentheses;

import java.util.*;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        String str = "((()()))";
        System.out.println(scoreOfParentheses(str));
    }

    public static int scoreOfParentheses(String s) {
        if (s.equals("()")) return 1;
        int score = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.peek() + Math.max(2 * score, 1);
                //everytime we see a new opening bracket we push 0
                //once we see ')' (closing) its going to be worth 1
                stack.pop();
            }
        }

        return score;
    }
}
