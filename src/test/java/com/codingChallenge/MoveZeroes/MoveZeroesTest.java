package com.codingChallenge.MoveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{1, 1, 1, 0}, MoveZeroes.moveZeroes(new int[]{1, 1, 0, 1}));
    }

    @Test
    void negative() {
        assertNotEquals(new int[]{1, 0, 0, 0}, MoveZeroes.moveZeroes(new int[]{1, 1, 0, 1}));
    }

    @Test
    void positiveTestII() {
        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, MoveZeroes.moveZeroesIII(new int[]{1, 0, 2, 0, 3}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(new int[]{0, 1, 0, 0, 0}, MoveZeroes.moveZeroesIII(new int[]{1, 0, 1, 0, 0}));
    }

}