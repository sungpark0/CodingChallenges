package com.codingChallenge.SortCharactersByFrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortCharactersByFrequencyTest {

    @Test
    void positiveTest() {
        assertEquals("eert", SortCharactersByFrequency.frequencySort("tree"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("bbaA", SortCharactersByFrequency.frequencySort("Aabb"));
    }

}