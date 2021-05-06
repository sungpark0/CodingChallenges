package com.codingChallenge.MostCommonWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostCommonWordTest {

    @Test
    void positiveTest() {
        assertEquals("ball", MostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
    }

    @Test
    void negativeTest() {
        assertNotEquals("..", MostCommonWord.mostCommonWord("a..", new String[]{""}));
    }

}