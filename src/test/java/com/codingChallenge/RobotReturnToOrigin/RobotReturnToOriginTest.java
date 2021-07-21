package com.codingChallenge.RobotReturnToOrigin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotReturnToOriginTest {

    @Test
    void positiveTest() {
        assertTrue(RobotReturnToOrigin.judgeCircleII("UD"));
    }

    @Test
    void negativeTest() {
        assertFalse(RobotReturnToOrigin.judgeCircleII("UL"));
    }

}