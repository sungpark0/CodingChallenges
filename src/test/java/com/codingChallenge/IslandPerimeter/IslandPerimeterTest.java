package com.codingChallenge.IslandPerimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandPerimeterTest {

    @Test
    void positiveTest(){
    int[][]test = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        assertEquals(16, IslandPerimeter.islandPerimeter(test));
    }

    @Test
    void negativeTest(){
        int[][]test = {{1, 1, 1, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 1, 0, 1}};
        assertNotEquals(14, IslandPerimeter.islandPerimeter(test));
    }

    @Test
    void positiveTestII(){
        int[][]test = {{1,0,1},{1,1,1}};
        assertEquals(12, IslandPerimeter.islandPerimeterIII(test));
    }

    @Test
    void negativeTestII(){
        int[][]test = {{1,0},{1,0}};
        assertNotEquals(8, IslandPerimeter.islandPerimeterIII(test));
    }
}