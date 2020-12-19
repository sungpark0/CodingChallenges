package com.codingChallenge.LongestPalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = "bananas")
    void positiveTest(String str) {
        assertEquals( 5, LongestPalindrome.longestPalindrome( str ) );
    }

    @ParameterizedTest
    @ValueSource(strings = "rotator")
    void negativeTest(String str) {
        assertNotEquals( 1, LongestPalindrome.longestPalindrome( str ) );
    }

}