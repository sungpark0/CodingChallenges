package com.codingChallenge.LargestSubstringBetweenTwoEqualCharacters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LargestSubstringBetweenTwoEqualCharactersTest {

    @ParameterizedTest
    @ValueSource(strings = "abcca")
    void positiveTest(String str){
        assertEquals(3, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersOptimal(str));
    }

    @ParameterizedTest
    @ValueSource(strings = "aa")
    void negativeTest(String str){
        assertNotEquals(1, LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharactersOptimal(str));
    }
}