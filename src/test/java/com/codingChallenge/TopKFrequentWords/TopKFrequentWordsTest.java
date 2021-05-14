package com.codingChallenge.TopKFrequentWords;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentWordsTest {

    @Test
    void positiveTest() {
        assertEquals(List.of("i", "love"), TopKFrequentWords.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of("day", "sunny", "is", "the"), TopKFrequentWords.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
    }

}