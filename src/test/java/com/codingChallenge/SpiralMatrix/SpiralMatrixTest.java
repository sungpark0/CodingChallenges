package com.codingChallenge.SpiralMatrix;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    @Test
    void positiveTest() {
        int[][] test = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        List<Integer> shouldBe = List.of(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
        assertEquals(shouldBe, SpiralMatrix.spiralOrder(test));
    }

    @Test
    void negativeTest() {
        int[][] test = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> shouldBe = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertNotEquals(shouldBe, SpiralMatrix.spiralOrder(test));
    }

    @Test
    void positiveTestII() {
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), SpiralMatrix.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(List.of(1, 2, 3, 4), SpiralMatrix.spiralOrder(new int[][]{{1, 2}, {3, 4}}));
    }
}