package com.codingChallenge.ScoreOfParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ScoreOfParenthesesTest {

    @ParameterizedTest
    @ValueSource ( strings = "((()()))")
    void positiveTest(String str){
        assertEquals(8, ScoreOfParentheses.scoreOfParentheses(str));
    }

    @ParameterizedTest
    @ValueSource ( strings = "(()())")
    void negativeTest(String str){
        assertNotEquals(1, ScoreOfParentheses.scoreOfParentheses(str));
    }
}