package com.codingChallenge.RemoveOutermostParentheses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOutermostParenthesesTest {

    @ParameterizedTest
    @ValueSource(strings = "(())(())(())")
    void positiveTest(String str) {
        assertEquals("()()()", RemoveOutermostParentheses.removeOuterParentheses(str));
    }

    @ParameterizedTest
    @ValueSource(strings = "()()")
    void negativeTest(String str) {
        assertNotEquals("()", RemoveOutermostParentheses.removeOuterParentheses(str));
    }

    @Test
    void positiveTestII(){
        String test = "()()";
        assertEquals("", RemoveOutermostParentheses.removeOuterParenthesesII(test));
    }

    @Test
    void negativeTest(){
        String test = "(())(())";
        assertNotEquals("(())()", RemoveOutermostParentheses.removeOuterParenthesesII(test));
    }

}