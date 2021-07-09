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

}