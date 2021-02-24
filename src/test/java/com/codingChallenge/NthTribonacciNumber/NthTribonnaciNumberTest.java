package com.codingChallenge.NthTribonacciNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonnaciNumberTest {

    @ParameterizedTest
    @ValueSource(ints = 25)
    void positiveTest(int num) {
        assertEquals(1389537, NthTribonacciNumber.tribonacci(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 4)
    void negativeTest(int num) {
        assertNotEquals(2, NthTribonacciNumber.tribonacci(num));
    }

}