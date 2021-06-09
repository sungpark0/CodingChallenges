package com.codingChallenge.RobotBoundedInCircle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RobotBoundedInCircleTest {

    @ParameterizedTest
    @ValueSource(strings = "GGLLGG")
    void positiveTest(String str){
        assertTrue(RobotBoundedInCircle.isRobotBounded(str));
    }

    @ParameterizedTest
    @ValueSource(strings = "GGGG")
    void negativeTest(String str){
        assertFalse(RobotBoundedInCircle.isRobotBounded(str));
    }

}