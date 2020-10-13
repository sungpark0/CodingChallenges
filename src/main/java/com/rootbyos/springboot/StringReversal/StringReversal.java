package com.rootbyos.springboot.StringReversal;

/**
 * 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * You may assume all the characters consist of printable ascii characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 * <p>
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

import com.rootbyos.springboot.ValidPalindrome.ValidPalindrome;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReversal {
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        String s1 = "Hello";
        System.out.println( reverseString( s ) );
        System.out.println( reverseStringRecursion( s1 ) );
        System.out.println( reverseStringStack( s1 ) );
    }

    public static char[] reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char tmp = s[start];
            s[start++] = s[end];
            s[end--] = tmp;
        }

        return s;
    }

    public static String reverseStringRecursion(String s) {

        if (s.length() == 0) {//base case
            return s;
        }
        return reverseStringRecursion( s.substring( 1 ) ) + s.charAt( 0 );
        //calling function until the base case meets
        //substring stores
    }

    public static String reverseStringStack(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        int i = 0;
        while (i < arr.length) {
            stack.push( arr[i] );
            i++;
        }
        int j = 0;
        while (j < arr.length) {
            char flipped = stack.pop();
            arr[j] = flipped;
            j++;
        }

        return String.valueOf( arr );
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