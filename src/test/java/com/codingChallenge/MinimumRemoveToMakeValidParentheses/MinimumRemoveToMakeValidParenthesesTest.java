package com.codingChallenge.MinimumRemoveToMakeValidParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveToMakeValidParenthesesTest {

    @ParameterizedTest
    @ValueSource (strings = "a)b(c)d")
    void positiveTest(String str){
        assertEquals("ab(c)d", MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(str));
    }

    @ParameterizedTest
    @ValueSource (strings = "))((")
    void negativeTest(String str){
        assertNotEquals("))", MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(str));
    }

}