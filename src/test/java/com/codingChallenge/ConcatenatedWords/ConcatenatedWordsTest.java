package com.codingChallenge.ConcatenatedWords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenatedWordsTest {

    @Test
    void positiveTest(){
        assertArrayEquals(List.of("catsdogcats","dogcatsdog","ratcatdogcat"), ConcatenatedWords.findAllConcatenatedWordsInADict(List.of("cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat")));
    }

}