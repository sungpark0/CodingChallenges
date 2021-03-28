package com.codingChallenge.TwoKeysKeyboard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TwoKeysKeyboardTest {

    @ParameterizedTest
    @ValueSource(ints = 15)
    void positiveTest(int num){
        assertEquals(8, TwoKeysKeyboard.minSteps(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 3)
    void negativeTest(int num){
        assertNotEquals(1, TwoKeysKeyboard.minSteps(num));
    }

}