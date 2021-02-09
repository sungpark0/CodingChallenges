package com.codingChallenge.ReverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void positiveTest() {
        char[] test = new char[]{'p', 'u', 'r', 'p', 'l', 'e'};
        ReverseString.reverseString(test);
        assertArrayEquals((new char[]{'e', 'l', 'p', 'r', 'u', 'p'}), test);
    }

    @Test
    void negativeTest() {
        char[] negTest = new char[]{'h', 'e', 'l', 'l', 'o'};
        ReverseString.reverseString(negTest);
        assertNotEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, negTest);
    }

}