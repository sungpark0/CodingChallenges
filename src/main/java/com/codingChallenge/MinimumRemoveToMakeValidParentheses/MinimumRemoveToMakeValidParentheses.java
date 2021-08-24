package com.codingChallenge.MinimumRemoveToMakeValidParentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {

        String str = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(str));

    }

    public static String minRemoveToMakeValidII(String s) {
        int[] arr = new int[s.length()];
        char[] chars = s.toCharArray();
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(') {
                arr[balance] = i;
                balance++;
            } else if (chars[i] == ')') {
                if (balance <= 0) {
                    chars[i] = 0;
                } else {
                    balance--;
                }
            }
        }

        for (int i = 0; i < balance; i++) {
            chars[arr[i]] = 0;
        }

        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != 0) {
                chars[index] = chars[i];
                index++;
            }
        }

        return new String(chars, 0, index);
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
            sChar[j] = '0';
        }
        for (char ch : sChar) {
            if (ch != '0') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
