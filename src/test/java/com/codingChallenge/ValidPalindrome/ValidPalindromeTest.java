package com.codingChallenge.ValidPalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"A man, a plan, a canal: Panama"})
    void positiveTest(String str) {
        assertEquals( true , ValidPalindrome.isPalindrome(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Sungmin"})
    void negativeTest(String str) {
        assertEquals( false , ValidPalindrome.isPalindrome(str));
    }

}