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

}