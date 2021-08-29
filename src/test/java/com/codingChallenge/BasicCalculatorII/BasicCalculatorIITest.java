package com.codingChallenge.BasicCalculatorII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIITest {

    @Test
    void positiveTest() {
        assertEquals(5, BasicCalculatorII.calculate("3+5/2"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(10, BasicCalculatorII.calculate("3+2*2"));
    }

}