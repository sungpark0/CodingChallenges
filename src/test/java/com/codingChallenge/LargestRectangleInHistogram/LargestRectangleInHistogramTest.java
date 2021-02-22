package com.codingChallenge.LargestRectangleInHistogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleInHistogramTest {

    @Test
    void positiveTest(){
        int[] test = new int[] {2,1,5,6,2,3};
        assertEquals(10, LargestRectangleInHistogram.largestRectangleArea(test));
    }

    @Test
    void negativeTest(){
        int[] negTest = new int[] {1,9};
        assertNotEquals(2, LargestRectangleInHistogram.largestRectangleArea(negTest));
    }

}