package com.rootbyos.springboot.ValidPalindrome;

/**
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * s consists only of printable ASCII characters.
 */

import java.lang.*;

public class ValidPalindrome {

    static String original = "A man, a plan, a canal: Panama";


    public static void main(String[] args) {

        isPalindrome( original );
        isPalindromeRecursion( original );
    }

    public static boolean isPalindrome(String s) {
        original = s.replaceAll( "[^a-zA-Z0-9]", "" ).toLowerCase(); //erasing whitespace

        int start = 0;
        int end = original.length() - 1;
        while (start < end) {
            if (original.charAt( start++ ) != original.charAt( end-- )) { // check palindrome
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeRecursion(String s) {
        String noSpace = s.replaceAll( "[^a-zA-Z0-9]", "" ).toLowerCase();

        if (noSpace.length() == 0 || noSpace.length() == 1) {
            return true;
        }
        if (noSpace.charAt( 0 ) == noSpace.charAt( s.length() - 1 )) {
            return isPalindromeRecursion( noSpace.substring( 1, noSpace.length() - 1 ) );
        } else {
            return false;
        }
    }
}



