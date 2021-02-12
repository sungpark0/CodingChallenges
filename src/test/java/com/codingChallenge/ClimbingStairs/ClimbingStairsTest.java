package com.codingChallenge.ClimbingStairs;

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

}