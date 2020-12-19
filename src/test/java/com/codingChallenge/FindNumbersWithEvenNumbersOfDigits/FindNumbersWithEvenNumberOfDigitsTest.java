package com.codingChallenge.FindNumbersWithEvenNumbersOfDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    void positiveTest() {
        int[] numbs = {12, 345, 2, 6, 7896};
        assertEquals( 2, FindNumbersWithEvenNumberOfDigits.findNumbers( numbs ) );
    }

    @Test
    void negativeTest() {
        int[] numbs = {555, 901, 482, 7896};
        assertNotEquals( 0, FindNumbersWithEvenNumberOfDigits.findNumbers( numbs ) );
    }
}