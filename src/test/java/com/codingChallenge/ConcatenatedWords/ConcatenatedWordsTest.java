package com.codingChallenge.ConcatenatedWords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenatedWordsTest {

    @Test
    void positiveTest() {
        assertEquals(List.of("catsdogcats", "dogcatsdog", "ratcatdogcat"), ConcatenatedWords.findAllConcatenatedWordsInADict(new String[]{"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of("cat", "dog"), ConcatenatedWords.findAllConcatenatedWordsInADict(new String[]{"cat", "dog", "catdog"}));
    }

}