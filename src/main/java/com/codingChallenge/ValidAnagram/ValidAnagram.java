package com.codingChallenge.ValidAnagram;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 242. Valid Anagram
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {

    public static void main(String[] args) {
//        String s = "poop";
//        String t = "oopp";

//        isAnagram(s, t);
//        isAnaramStream(s, t);
        System.out.println("Hello");

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);
        System.out.println();

        return Arrays.equals(firstString, secondString);
    }

    public static boolean isAnaramStream(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining()).equals(Arrays.stream(t.split("")).sorted().collect(Collectors.joining()));
    }

    public static boolean isAnagramII(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i]) return false;
        }

        return true;
    }

//    public static String sortedLetters(String str) {
//        return Arrays.stream( str.split( "" ) ).sorted().collect( Collectors.joining() );
//    }

}
