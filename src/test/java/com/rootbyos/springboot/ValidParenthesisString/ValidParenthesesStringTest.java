package com.rootbyos.springboot.ValidParenthesisString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesStringTest {

    @ParameterizedTest
    @ValueSource(strings = "(*)")
    void positiveTest(String str) {
        assertTrue(ValidParenthesesString.checkValidString(str));
    }

    @ParameterizedTest
    @ValueSource(strings = ")())(")
    void negativeTest(String str) {
        assertNotEquals(true, ValidParenthesesString.checkValidString(str));
    }
}