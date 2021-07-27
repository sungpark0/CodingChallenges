package com.codingChallenge.LongestPalindromeSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSubstringTest {

    @Test
    void positiveTest() {
        assertEquals("bab", LongestPalindromeSubstring.longestPalindrome("babas"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("a", LongestPalindromeSubstring.longestPalindrome("aa"));
    }

    @Test
    void positiveTestII() {
        assertEquals("bb", LongestPalindromeSubstring.longestPalindrome("cbbd"));
    }

    @Test
    void negativeTestII() {
        assertNotEquals("a", LongestPalindromeSubstring.longestPalindrome("baa"));
    }

}