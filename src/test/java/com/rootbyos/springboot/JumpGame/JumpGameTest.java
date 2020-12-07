package com.rootbyos.springboot.JumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    void positiveTest() {
        int[] test = {3, 2, 3, 0, 5};
        assertTrue(JumpGame.canJump(test));
    }

    @Test
    void negativeTest() {
        int[] test = {3, 2, 1, 0, 4};
        assertFalse(JumpGame.canJump(test));
    }

}