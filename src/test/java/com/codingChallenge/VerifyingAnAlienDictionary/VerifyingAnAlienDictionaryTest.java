package com.codingChallenge.VerifyingAnAlienDictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyingAnAlienDictionaryTest {

    @Test
    void positiveTest() {
        assertTrue(VerifyingAnAlienDictionary.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    void negativeTest() {
        assertFalse(VerifyingAnAlienDictionary.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
    }

}