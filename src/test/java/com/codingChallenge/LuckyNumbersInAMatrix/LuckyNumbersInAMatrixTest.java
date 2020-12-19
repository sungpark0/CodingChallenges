package com.codingChallenge.LuckyNumbersInAMatrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LuckyNumbersInAMatrixTest {

    @Test
    void positiveTest(){
        int[][] test = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        List<Integer> actual = new ArrayList<>();
        actual.add(12);
        assertEquals(actual, LuckyNumbersInAMatrix.luckyNumbers(test));
    }

    @Test
    void negativeTest(){
        int[][] test = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        List<Integer> actual = new ArrayList<>();
        actual.add(11);
        assertNotEquals(actual, LuckyNumbersInAMatrix.luckyNumbers(test));
    }

}