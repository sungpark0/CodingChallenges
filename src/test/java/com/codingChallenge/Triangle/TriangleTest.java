package com.codingChallenge.Triangle;

import com.codingChallenge.MinimumPathSum.MinimumPathSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class TriangleTest {

    @Test
    void positiveTest() {
        List<List<Integer>> test = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
        assertEquals(11, Triangle.minimumTotal(test));
    }

    @Test
    void negativeTest() {
        List<List<Integer>> negTest = List.of(List.of(1), List.of(2, 3), List.of(7, 8, 4));
        assertNotEquals(7, Triangle.minimumTotal(negTest));
    }

    @Test
    void positiveTestII() {
        List<List<Integer>> test = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7));
        assertEquals(10, Triangle.minimumTotalII(test));
    }

    @Test
    void negativeTestII() {
        List<List<Integer>> negTest = List.of(List.of(1), List.of(2, 3), List.of(4, 5, 6));
        assertNotEquals(10, Triangle.minimumTotalII(negTest));
    }

}

