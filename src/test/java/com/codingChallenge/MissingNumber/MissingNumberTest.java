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

}