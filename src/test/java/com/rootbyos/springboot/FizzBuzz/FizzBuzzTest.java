package com.rootbyos.springboot.FizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @ParameterizedTest
    @ValueSource(ints = 5)
    void positiveTest(int num){
        assertEquals("[1, 2, Fizz, 4, Buzz]", FizzBuzz.fizzBuzz(num));
    }

    @ParameterizedTest
    @ValueSource (ints = 3)
    void negativeTest(int num){
        assertNotEquals( "[1, 2, 3]", FizzBuzz.fizzBuzz(num));
    }
}