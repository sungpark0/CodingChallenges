package com.codingChallenge.SubarraySumEqualsK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {

    @Test
    void positiveTest() {
        assertEquals(2, SubarraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 3));
    }

    @Test
    void negativeTest() {
        assertNotEquals(5, SubarraySumEqualsK.subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    void positiveTestII() {
        assertEquals(1, SubarraySumEqualsK.subarraySum(new int[]{1, 4, 5}, 9));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(1, SubarraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 3));
    }

    @Test
    void positiveTestIII() {
        assertEquals(2, SubarraySumEqualsK.subarraySumII(new int[]{1, 1, 2, 3, 4, 5}, 5));
    }

    @Test
    void negativeTestIII() {
        assertNotEquals(1, SubarraySumEqualsK.subarraySumII(new int[]{1, 4, 2, 3}, 5));
    }

}