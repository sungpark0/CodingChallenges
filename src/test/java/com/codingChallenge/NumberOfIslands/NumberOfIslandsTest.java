package com.codingChallenge.NumberOfIslands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    @Test
    void positiveTest() {
        assertEquals(1, NumberOfIslands.numIslands(new char[][]
                {
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
                }));
    }

    @Test
    void negativeTest() {
        assertNotEquals(2, NumberOfIslands.numIslands(new char[][]
                {
                        {'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'1', '0', '1', '0', '0'},
                        {'0', '0', '0', '1', '1'}
                }));
    }

    @Test
    void positiveTestII() {
        assertEquals(2, NumberOfIslands.numIslands(new char[][]
                {
                        {'1', '0', '1'},
                        {'1', '1', '0'}
                }));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(3, NumberOfIslands.numIslands(new char[][]
                {
                        {'1', '0', '0'},
                        {'1', '0', '0'},
                        {'0', '0', '1'}
                }));
    }

}