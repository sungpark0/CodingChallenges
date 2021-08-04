package com.codingChallenge.FirstUniqueCharacterInAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    @Test
    void positiveTest() {
        assertEquals(2, FirstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, FirstUniqueCharacterInAString.firstUniqChar("aabb"));
    }

    @Test
    void positiveTestII() {
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqCharII("leetcode"));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(0, FirstUniqueCharacterInAString.firstUniqCharII("aab"));
    }

}