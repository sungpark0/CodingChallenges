package com.codingChallenge.NQueensII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NQueensIITest {

    @ParameterizedTest
    @ValueSource(ints = 4)
    void positiveTest(int num){
        assertEquals(2, NQueensII.totalNQueens(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 1)
    void edgeCase(int num){
        assertEquals(1, NQueensII.totalNQueens(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 2)
    void negativeTest(int num){
        assertNotEquals(1, NQueensII.totalNQueens(num));
    }

}