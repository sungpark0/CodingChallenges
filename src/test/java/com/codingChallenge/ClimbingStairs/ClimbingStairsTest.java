package com.codingChallenge.ClimbingStairs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @ParameterizedTest
    @ValueSource(ints = 5)
    void positiveTest(int num){
        assertEquals(8, ClimbingStairs.climbStairs(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 3)
    void negativeTest(int num){
        assertNotEquals(4, ClimbingStairs.climbStairs(num));
    }

    @Test
    void positiveTestII() {
        assertEquals(21, ClimbingStairs.climbStairs(7));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(2, ClimbingStairs.climbStairs(3));
    }

    @Test
    void positiveTestIII() {
        assertEquals(8, ClimbingStairs.climbStairs(5));
    }

    @Test
    void negativeTestIII() {
        assertNotEquals(5, ClimbingStairs.climbStairs(11));
    }

}