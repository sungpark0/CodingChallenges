package com.codingChallenge.SortColors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    @Test
    void positiveTesT() {
        int[] test = new int[]{2, 0, 2, 1, 1, 0};
        SortColors.sortColors(test);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, test);
    }

    @Test
    void negativeTest() {
        int[] negTest = new int[]{2, 0, 1};
        SortColors.sortColors(negTest);
        assertNotEquals(new int[]{0, 2, 1}, negTest);
    }

}