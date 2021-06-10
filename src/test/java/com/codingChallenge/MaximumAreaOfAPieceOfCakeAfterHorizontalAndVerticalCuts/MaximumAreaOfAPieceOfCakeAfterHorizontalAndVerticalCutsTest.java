package com.codingChallenge.MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {

    @Test
    void positiveTest() {
        assertEquals(4, MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts.maxArea(5, 4, new int[]{1, 2, 4}, new int[]{1, 3}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(2, MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts.maxArea(5, 4, new int[]{3, 1}, new int[]{1}));
    }

}