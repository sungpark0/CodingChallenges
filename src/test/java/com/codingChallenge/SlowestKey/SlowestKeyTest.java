package com.codingChallenge.SlowestKey;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlowestKeyTest {

    @Test
    void positiveTest() {
        assertEquals('a', SlowestKey.slowestKey(new int[]{12, 23, 36, 46, 62}, "spuda"));
    }

    @Test
    void negativeTest() {
        assertNotEquals('b', SlowestKey.slowestKey(new int[]{9, 29, 49, 50}, "cbcd"));
    }
}