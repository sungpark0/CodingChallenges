package com.codingChallenge.LargestPerimeterTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPerimeterTriangleTest {

    @Test
    void positiveTest() {
        assertEquals(5, LargestPerimeterTriangle.largestPerimeter(new int[]{2, 1, 2}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, LargestPerimeterTriangle.largestPerimeter(new int[]{1, 2, 1}));
    }

}