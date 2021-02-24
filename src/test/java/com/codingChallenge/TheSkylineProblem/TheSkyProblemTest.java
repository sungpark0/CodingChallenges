package com.codingChallenge.TheSkylineProblem;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TheSkyProblemTest {

    @Test
    void positiveTest(){
        int[][] test = new int[][]{{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        assertEquals(List.of(List.of(2,10),List.of(3,15),List.of(7,12),List.of(12,0),List.of(15,10),List.of(20,8),List.of(24,0)), TheSkyProblem.getSkyline(test));
    }

    @Test
    void negativeTest(){
        int[][] test = new int[][]{{2,9,10},{3,7,15},{5,12,12}};
        assertNotEquals(List.of(List.of(0,0),List.of(2,10),List.of(3,15),List.of(7,12),List.of(12,0)), TheSkyProblem.getSkyline(test));
    }
}