package com.codingChallenge.FibonacciNumber;

import org.junit.jupiter.api.Test;
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

    @ParameterizedTest
    @ValueSource(ints = 6)
    void positiveTestMemoization(int num) {
        assertEquals( 8, FibonacciNumber.fibMemoization( num ) );
    }

    @ParameterizedTest
    @ValueSource(ints = 5)
    void negativeTestMemoization(int num) {
        assertNotEquals(2, FibonacciNumber.fibMemoization(num));
    }

    @Test
    void positiveTest() {
        assertEquals(3, FibonacciNumber.fibIII(4));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, FibonacciNumber.fibIII(3));
    }
}