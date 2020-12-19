package com.codingChallenge.StringReversal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
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

//shift + cmd + T - create a new test
class StringReversalTest {
    //    @ParameterizedTest
//    @ValueSource(strings = {"hello"})
//    void positiveTest(String str) {
//        String s = "olleh";
//        char[] e = s.toCharArray();
//        char[] expected = {'o', 'l', 'l', 'e', 'h'};
//        assertEquals(String.valueOf(expected), String.valueOf(StringReversal.reverseString(str.toCharArray())));
//    }
//
//
//    @ParameterizedTest
//    @ValueSource(strings = {"hello"})
//    void negativeTest(String str) {
//        char[] expected = {'o', 'l', 'l', 'e', 'h'};
//        assertTrue(expected!=expected, String.valueOf(StringReversal.reverseString(str.toCharArray())));
//    }
//
//    private void assertTrue(boolean b, String valueOf) {
//    }
//    /** EXAMPLE OF A NEGATIVE TEST */
//    @ParameterizedTest
//    @ValueSource (strings = {"IamWrong"})
//    void negativeTest2 (String str){
//        assertNotEquals( "olleh", String.valueOf(StringReversal.reverseString(str.toCharArray())));
//    }

    @ParameterizedTest
    @ValueSource(strings = {"hello"})
    void positiveTestRecursion(String str) {
        assertEquals( "olleh", StringReversal.reverseStringRecursion( str ) );
    }

    @ParameterizedTest
    @ValueSource(strings = {"negative test"})
    void negativeTestRecursion(String str) {
        assertNotEquals( "negative test", StringReversal.reverseStringRecursion( str ) );
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello"})
    void positiveTestStack(String str) {
        assertEquals( "olleh", StringReversal.reverseStringStack( str ) );
    }

    @ParameterizedTest
    @ValueSource(strings = {"negative test"})
    void negativeTestStack(String str) {
        assertNotEquals( "negative test", StringReversal.reverseStringRecursion( str ) );
    }
}