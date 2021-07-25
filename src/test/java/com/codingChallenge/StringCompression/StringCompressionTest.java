package com.codingChallenge.StringCompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void positiveTest() {
        assertEquals(6, StringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(4, StringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'a', 'a', 'a'}));
    }

}