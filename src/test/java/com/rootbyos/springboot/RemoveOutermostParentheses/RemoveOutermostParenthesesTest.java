package com.rootbyos.springboot.RemoveOutermostParentheses;

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

}