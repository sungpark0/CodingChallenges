package com.codingChallenge.ZigZagConversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {

    @Test
    void positiveTest() {
        assertEquals("PAHNAPLSIIGYIR", ZigZagConversion.convert("PAYPALISHIRING", 3));
    }

    @Test
    void negativeTest() {
        assertNotEquals("PAYPALISHIRING", ZigZagConversion.convert("PAHNAPLSIIGYIR", 4));
    }

}