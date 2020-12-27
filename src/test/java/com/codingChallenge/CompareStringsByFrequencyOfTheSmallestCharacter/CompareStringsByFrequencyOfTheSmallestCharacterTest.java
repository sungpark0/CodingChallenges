package com.codingChallenge.CompareStringsByFrequencyOfTheSmallestCharacter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CompareStringsByFrequencyOfTheSmallestCharacterTest {

    @Test
    void positiveTest() {
        String[] queries = {"bbb", "cc"};
        String[] word = {"a", "aa", "aaa", "aaaa"};
        assertArrayEquals(new int[]{1, 2}, CompareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, word));
    }

    @Test
    void negativeTest() {
        String[] queries = {"cbd"};
        String[] word = {"zaaaz"};
        assertArrayEquals(new int[]{0, 1}, CompareStringsByFrequencyOfTheSmallestCharacter.numSmallerByFrequency(queries, word));
    }

}