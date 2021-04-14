package com.codingChallenge.CombinationSumIV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIVTest {

    @Test
    void positiveTest() {
        assertEquals(7, CombinationSumIV.combinationSum4(new int[]{1, 2, 3}, 4));
    }

    @Test
    void negativeTest() {
        assertNotEquals(3, CombinationSumIV.combinationSum4(new int[]{3}, 9));
    }

}