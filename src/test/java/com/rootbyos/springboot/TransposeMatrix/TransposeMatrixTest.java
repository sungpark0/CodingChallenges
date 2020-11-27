package com.rootbyos.springboot.TransposeMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @Test
    void positiveTest(){
        int[][] test = {{1,2,3},{4,5,6}};
        int[][] shouldBe={{1,4},{2,5},{3,6}};
        assertArrayEquals(shouldBe, TransposeMatrix.transpose(test));
    }

    @Test
    void negativeTest(){
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] shouldBe={{1,4},{2,5},{3,6}};
        assertNotEquals(shouldBe, TransposeMatrix.transpose(test));
    }
}