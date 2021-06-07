package com.codingChallenge.PointPuzzle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PointPuzzleTest {

    @Test
    void positiveTest() {
        List<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(6);
        test.add(6);
        test.add(4);
        test.add(11);
        assertEquals(27, PointPuzzle.maxPoints(test));
    }

    @Test
    void negativeTest() {
        List<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(3);
        test.add(4);
        test.add(2);
        assertNotEquals(12, PointPuzzle.maxPoints(test));
    }

}