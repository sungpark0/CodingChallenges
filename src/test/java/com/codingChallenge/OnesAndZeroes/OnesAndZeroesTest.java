package com.codingChallenge.OnesAndZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnesAndZeroesTest {

    @Test
    void positiveTest() {
        String[] test = new String[]{"10", "0001", "111001", "1", "0"};
        assertEquals(4, OnesAndZeroes.findMaxForm(test, 5, 3));
    }

    @Test
    void negativeTest() {
        String[] test = new String[]{"10", "0", "1"};
        assertNotEquals(3, OnesAndZeroes.findMaxForm(test, 1, 1));
    }

}