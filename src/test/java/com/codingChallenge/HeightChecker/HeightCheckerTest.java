package com.codingChallenge.HeightChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckerTest {

    @Test
    void positiveTest() {
        int[] test = {5, 3, 3, 4, 5};
        assertEquals(3, HeightChecker.heightChecker(test));
    }

    @Test
    void negativeTest() {
        int[] test = {1, 2, 3, 4, 5};
        assertNotEquals(1, HeightChecker.heightChecker(test));
    }

    @Test
    void positiveTestTwo() {
        int[] test = {1, 2, 6, 5, 4, 3};
        assertEquals(4, HeightChecker.heightCheckerTwo(test));
    }

    @Test
    void negativeTestTwo() {
        int[] test = {1, 2, 6, 5, 4, 3};
        assertNotEquals(0, HeightChecker.heightCheckerTwo(test));
    }

}
//    @ParameterizedTest
//    @ValueSource (int[] arr = {5,3,3,4,5});
//    void jUnitTestOne