package com.codingChallenge.MinimumRemoveToMakeValidParentheses;

import com.codingChallenge.ValidPalindromeII.ValidPalindromeII;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveToMakeValidParenthesesTest {

    @ParameterizedTest
    @ValueSource(strings = "a)b(c)d")
    void positiveTest(String str) {
        assertEquals("ab(c)d", MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(str));
    }

    @ParameterizedTest
    @ValueSource(strings = "))((")
    void negativeTest(String str) {
        assertNotEquals("))", MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid(str));
    }

    @Test
    void positiveTest() {
        assertEquals("lee(t(c)o)de", MinimumRemoveToMakeValidParentheses.minRemoveToMakeValidII("lee(t(c)o)de)"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(")(", MinimumRemoveToMakeValidParentheses.minRemoveToMakeValidII("))(("));
    }

}