package com.codingChallenge.FizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @ParameterizedTest
    @ValueSource(ints = 10)
    void positiveTest(int num){
        assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]", FizzBuzz.fizzBuzz(num));
    }

    @ParameterizedTest
    @ValueSource (ints = 10)
    void negativeTest(int num){
        assertNotEquals( "[1, 2, 3, 4, 5, 6, 7, 8, 9, Buzz]", FizzBuzz.fizzBuzz(num));
    }
}