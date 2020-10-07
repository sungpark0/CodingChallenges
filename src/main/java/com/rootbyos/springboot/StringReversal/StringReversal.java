package com.rootbyos.springboot.StringReversal;

/**
 * 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
import com.rootbyos.springboot.ValidPalindrome.ValidPalindrome;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import java.lang.*;

public class StringReversal {
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        System.out.println(reverseString(s));
    }

    public static char[] reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while(start<end) {
            char tmp = s[start];
            s[start++] = s[end];
            s[end--] = tmp;
        }

        return s;



    }
}

//            private static char[] recursion(char[] s, int left, int right) {
//                if (left == right) {
//                    return s;
//                } else {
//                    char tmp = s[left];
//                    s[left] = s[right];
//                    s[right] = tmp;
//
//                    return recursion(s, left + 1, right -1);
//                }
//
//            }

// if (left != right) {
//            char tmp = s[left];
//            s[left] = s[right];
//            s[right] = tmp;
//
//            recursion(s, left + 1, right - 1);
//        }

//  below is to use the userinput.
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Give me a word");
//
//        String word = myObj.nextLine();
//
//        char[] s = word.toCharArray();