package com.codingChallenge.WordLadder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {

    @Test
    void positiveTest() {
        assertEquals(5, WordLadder.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, WordLadder.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }

}