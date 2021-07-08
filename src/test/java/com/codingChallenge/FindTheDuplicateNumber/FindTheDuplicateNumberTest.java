package com.codingChallenge.FindTheDuplicateNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDuplicateNumberTest {

    @Test
    void positiveTest() {
        assertEquals(2, FindTheDuplicateNumber.findDuplicate(new int[]{1, 2, 2}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, FindTheDuplicateNumber.findDuplicate(new int[]{1, 2, 3}));
    }
}