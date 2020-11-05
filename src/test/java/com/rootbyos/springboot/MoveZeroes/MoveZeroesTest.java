package com.rootbyos.springboot.MoveZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void positiveTest() {
        int[] test = {1, 1, 0, 1};
        int[] shouldBe = {1, 1, 1, 0};
        MoveZeroes.moveZeroes( test );
        assertArrayEquals( shouldBe, test );
    }

    @Test
    void negative() {
        int[] test = {1, 1, 0, 1};
        int[] shouldBe = {1, 0, 0, 0};
        MoveZeroes.moveZeroes( test );
        assertNotEquals( shouldBe, test );
    }

}