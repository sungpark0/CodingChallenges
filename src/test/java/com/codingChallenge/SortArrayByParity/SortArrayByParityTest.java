package com.codingChallenge.SortArrayByParity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{2, 4, 3, 1}, SortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{1, 2, 3, 4}, SortArrayByParity.sortArrayByParity(new int[]{1, 3, 2, 4,}));
    }

}