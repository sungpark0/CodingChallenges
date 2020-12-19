package com.codingChallenge.ThreeConsecutiveOdds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeConsecutiveOddsTest {

    @Test
    void positiveTest(){
        int[] test = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        assertEquals(true, ThreeConsecutiveOdds.threeConsecutiveOdds(test));
    }

    @Test
    void negativeTest(){
        int[] test = {3,7,9,8};
        assertNotEquals(false, ThreeConsecutiveOdds.threeConsecutiveOdds(test));
    }
}