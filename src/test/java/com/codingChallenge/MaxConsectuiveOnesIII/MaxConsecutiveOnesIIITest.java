package com.codingChallenge.MaxConsectuiveOnesIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {

    @Test
    void positiveTest() {
        assertEquals(6, MaxConsecutiveOnesIII.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(2, MaxConsecutiveOnesIII.longestOnes(new int[]{0, 1, 1, 0, 1, 1}, 2));
    }

}