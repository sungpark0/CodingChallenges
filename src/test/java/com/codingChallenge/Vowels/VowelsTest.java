package com.codingChallenge.Vowels;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelsTest {

    @ParameterizedTest
    @ValueSource(strings = {"ab", "eb", "ib", "ob", "bu"})
    void positiveTest(String str) {
        assertEquals(1, Vowels.vowels(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"bz", "b!", "b-", "bb", "bz"})
    void negativeTest(String str) {
        assertEquals(0, Vowels.vowels(str));
    }
}