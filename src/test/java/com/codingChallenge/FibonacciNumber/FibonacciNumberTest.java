package com.codingChallenge.FibonacciNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @ParameterizedTest
    @ValueSource(ints = 3)
    void positiveTestRecursion(int f) {
        assertEquals( 2, FibonacciNumber.fibRecursion( f ) );
    }

    @ParameterizedTest
    @ValueSource(ints = 4)
    void negativeTestRecursion(int f) {
        assertNotEquals( 2, FibonacciNumber.fibRecursion( f ) );
    }

    @ParameterizedTest
    @ValueSource(ints = 4)
    void positiveTest(int f) {
        assertEquals( 3, FibonacciNumber.fib( f ) );
    }

    @ParameterizedTest
    @ValueSource(ints = 4)
    void negativeTest(int f) {
        assertNotEquals( 0, FibonacciNumber.fib( f ) );
    }

}