package com.codingChallenge.PascalsTriangleII;

import com.codingChallenge.PascalsTriangle.PascalsTriangle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleIITest {

    @ParameterizedTest
    @ValueSource(ints = 3)
    void positiveTest(int num) {
        assertEquals(List.of(1, 3, 3, 1), PascalsTriangleII.getRow(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 2)
    void negativeTest(int num) {
        assertNotEquals(List.of(1, 1, 1), PascalsTriangleII.getRow(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 2)
    void positiveTestPascalTriangleI(int num) {
        assertEquals(List.of(List.of(1), List.of(1, 1)), PascalsTriangle.generate(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 3)
    void negativeTestPascalTriangleI(int num) {
        assertNotEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 1, 1)), PascalsTriangle.generate(num));
    }


}