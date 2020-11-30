package com.rootbyos.springboot.SumOfAllOddLengthSubarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllOddLengthSubarrayTest {

    @Test
    void positiveTest() {
        int[] test = {1, 4, 2, 5, 3};
        assertEquals(58, SumOfAllOddLengthSubarray.sumOddLengthSubarrays(test));
    }

    @Test
    void negativeTest() {
        int[] test = {6, 6, 8};
        assertNotEquals(41, SumOfAllOddLengthSubarray.sumOddLengthSubarrays(test));
    }
}