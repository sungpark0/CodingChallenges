package com.codingChallenge.ValidParentheses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @ParameterizedTest
    @ValueSource (strings = "{[]}")
    void positiveTest(String str){
        assertEquals(true, ValidParentheses.isValid(str));
    }

    @ParameterizedTest
    @ValueSource (strings = "()(]")
    void negativeTest(String str){
        assertNotEquals(true, ValidParentheses.isValid(str));
    }

    @Test
    void positiveTest() {
        assertTrue(ValidParentheses.isValidIII("()"));
    }

    @Test
    void negativeTest() {
        assertFalse(ValidParentheses.isValidIII("(()"));
    }
}