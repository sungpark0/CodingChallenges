package com.rootbyos.springboot.FibonacciNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @ParameterizedTest
    @ValueSource(ints = 3)
    void positiveTest(int f) {
        assertEquals( 2, FibonacciNumber.fibRecursion( f ) );
    }

    @ParameterizedTest
    @ValueSource(ints = 4)
    void negativeTest(int f) {
        assertNotEquals( 2, FibonacciNumber.fibRecursion( f ) );
    }

}