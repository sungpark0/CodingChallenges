package com.codingChallenge.ReverseWordsInAStringIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringIIITest {

    @Test
    void positiveTest() {
        assertEquals("doG gniD", ReverseWordsInAStringIII.reverseWords("God Ding"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("Leetcode contest", ReverseWordsInAStringIII.reverseWords("leetcode contest"));
    }

}