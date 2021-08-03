package com.codingChallenge.MissingNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void positiveTest() {
        assertEquals(2, MissingNumber.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(5, MissingNumber.missingNumber(new int[]{1, 2}));
    }

    @Test
    void positiveTestII() {
        assertEquals(8, MissingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(0, MissingNumber.missingNumber(new int[]{0, 1}));
    }

}