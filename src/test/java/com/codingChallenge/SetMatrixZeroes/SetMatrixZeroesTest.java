package com.codingChallenge.SetMatrixZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesTest {

    @Test
    void positiveTest() {
        int[][] test = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        SetMatrixZeroes.setZeroes(test);
        assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, test);
    }

}