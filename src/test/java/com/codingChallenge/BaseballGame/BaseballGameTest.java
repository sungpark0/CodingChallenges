package com.codingChallenge.BaseballGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    @Test
    void positiveTest() {
        assertEquals(30, BaseballGame.calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(14, BaseballGame.calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

}