package com.codingChallenge.LongestPalindrome;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestPalindrome {

    public static void main(String[] args) {

        String str = "bananas";
        System.out.println( longestPalindrome( str ) );
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        int counter = 0;

        System.out.println( Arrays.toString( ch ) ); //Mapping (ch, # of ch)
        for (char i : ch) {
            if (map.containsKey( i )) {
                map.put( i, map.get( i ) + 1 );
            } else {
                map.put( i, 1 );
            }
        }

        int[] evenAndOdd = map.values().stream().mapToInt( j -> j ).toArray();
        // making an array of values ( K, V) only want the value of V's

        for (int i = 0; i < evenAndOdd.length; i++) {
            if (evenAndOdd[i] % 2 == 0) {
                // If element is even, add counter + element and change the value of element to 0(to get rid of it)
                counter += evenAndOdd[i];
                evenAndOdd[i] = 0;
            }
            if (evenAndOdd[i] % 2 != 0 && evenAndOdd[i] > 2) {
                // If element is odd and larger than 2(starting from odd # 3), add counter + element(odd)-1
                // and change the value of element to 1. Because only counted for the even so still
                // need to leave one number of odd element
                counter += evenAndOdd[i] - 1;
                evenAndOdd[i] = 1;
            }
        }

        for (int num : evenAndOdd) {
            //adding just one unique odd number for center piece if length of string is Odd.
            //Increment counter by one and break after just finding one odd.
            if (num % 2 != 0) {
                counter++;
                break;
            }
        }
        return counter;
    }
}
//    /**
//     * Time Complexity: O(N)
//     * Space Complexity: O(1)
//     */
//    example 1)
//    public static int longestPalindromeI(String s) {
//        Map<String, Integer> map = new HashMap<>();
//
//        String[] letters = s.split("");
//        AtomicInteger oddCounter = new AtomicInteger(0);
//        AtomicInteger isOdd = new AtomicInteger(0);
//        for (String letter : letters) {
//            if (map.containsKey(letter)) {
//                map.put(letter, map.get(letter) + 1);
//            } else {
//                map.put(letter, 1);
//            }
//        }
//
//        map.forEach((k,v) -> {
//            if (v % 2 != 0) {
//                if (isOdd.get() == 1) {
//                    oddCounter.set(oddCounter.get() + 1);
//                } else {
//                    isOdd.set(1);
//                }
//            }
//        });
//
//        return s.length() - oddCounter.get();
//    }
//
//
//    /**
//     * Time Complexity: O(N)
//     * Space Complexity: O(1)
//     */
//    example 2)
//    public static int longestPalindromeII(String s) {
//        int[] count = new int[128]; //???????
//        for (char c: s.toCharArray())
//            count[c]++;
//
//        int result = 0;
//        for (int v: count) {
//            result += v / 2 * 2;
//            if (result % 2 == 0 && v % 2 == 1)
//                result++;
//        }
//        return result;
//    }
