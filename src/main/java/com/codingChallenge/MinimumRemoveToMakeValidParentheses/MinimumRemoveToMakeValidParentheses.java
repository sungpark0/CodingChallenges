package com.codingChallenge.MinimumRemoveToMakeValidParentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {

        String str = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(str));

    }

    public static String minRemoveToMakeValid(String s) {
        List<Integer> possibleDelete = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        char[] sChar = s.toCharArray();
        int leftToRight = 0;
        int rightToLeft = 0;
        int left = 0;
        int right = sChar.length - 1;

        while (left < sChar.length) { //left to right
            if (sChar[left] == '(') {
                leftToRight++;
            } else if (sChar[left] == ')') {
                leftToRight--;
            }

            if (leftToRight < 0) {
                possibleDelete.add(left);
                leftToRight = 0;
            }
            left++;
        }
        System.out.println(possibleDelete);

        while (right >= 0) { //right to left
            if (sChar[right] == ')') {
                rightToLeft++;
            } else if (sChar[right] == '(') {
                rightToLeft--;
            }

            if (rightToLeft < 0) {
                possibleDelete.add(right);
                rightToLeft = 0;
            }
            right--;
        }

        for (int j : possibleDelete) {
            sChar[j] = '[';
        }
        for (char ch : sChar) {
            if (ch != '[') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
