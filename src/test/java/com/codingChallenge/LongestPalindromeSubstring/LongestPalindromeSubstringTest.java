package com.codingChallenge.LongestPalindromeSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSubstringTest {

    @Test
    void positiveTest(){
        assertEquals("bab", LongestPalindromeSubstring.longestPalindrome("babas"));
    }

    @Test
    void negativeTest(){
        assertNotEquals("a", LongestPalindromeSubstring.longestPalindrome("aa"));
    }

}