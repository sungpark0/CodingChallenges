package com.codingChallenge.FractionAdditionAndSubtraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionAdditionAndSubtractionTest {

    @Test
    void positiveTest() {
        assertEquals("0/1", FractionAdditionAndSubtraction.fractionAddition("-1/2+1/2"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("1/6", FractionAdditionAndSubtraction.fractionAddition("1/3-1/2"));
    }

}