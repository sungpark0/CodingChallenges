package com.codingChallenge.HappyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void positiveTest() {
        assertTrue(HappyNumber.isHappy(19));
    }

    @Test
    void negativeTest() {
        assertFalse(HappyNumber.isHappy(2));
    }

}