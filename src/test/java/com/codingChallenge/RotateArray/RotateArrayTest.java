package com.codingChallenge.RotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void positiveTest() {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7};
        RotateArray.rotate(test, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, test);
    }

    @Test
    void negativeTest() {
        int[] test = new int[]{-1};
        RotateArray.rotate(test, 2);
        assertNotEquals(new int[]{}, test);
    }
}