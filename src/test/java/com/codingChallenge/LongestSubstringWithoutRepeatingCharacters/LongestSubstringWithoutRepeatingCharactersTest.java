package com.codingChallenge.LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void positiveTest() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(5, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aaaaa"));
    }

}