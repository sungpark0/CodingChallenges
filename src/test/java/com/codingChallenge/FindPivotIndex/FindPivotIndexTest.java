package com.codingChallenge.FindPivotIndex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndexTest {

    @Test
    void positiveTest() {
        assertEquals(3, FindPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, FindPivotIndex.pivotIndex(new int[]{2, 1, -1}));
    }

}