package com.codingChallenge.SubstringsOfSizeThreeWithDistinctCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringsOfSizeThreeWithDistinctCharactersTest {

    @Test
    void positiveTest() {
        assertEquals(1, SubstringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings("xyzzaz"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(2, SubstringsOfSizeThreeWithDistinctCharacters.countGoodSubstrings("aabbabc"));
    }
}