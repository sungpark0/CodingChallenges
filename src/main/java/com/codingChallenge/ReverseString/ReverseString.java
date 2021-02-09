package com.codingChallenge.ReverseString;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] ch = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }
}
