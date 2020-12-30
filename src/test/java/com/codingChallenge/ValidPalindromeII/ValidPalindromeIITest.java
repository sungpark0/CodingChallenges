package com.codingChallenge.ValidPalindromeII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeIITest {

    @ParameterizedTest
    @ValueSource(strings = "abca")
    void positiveTest(String str) {
        assertTrue(ValidPalindromeII.validPalindrome(str));
    }

    @ParameterizedTest
    @ValueSource(strings = "abbzca")
    void negativeTrue(String str) {
        assertFalse(ValidPalindromeII.validPalindrome(str));
    }

}