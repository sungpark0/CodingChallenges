package com.codingChallenge.SplitAStringInBalancedStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitAStringInBalancedStringsTest {

    @Test
    void positiveTest() {
        assertEquals(4, SplitAStringInBalancedStrings.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(4, SplitAStringInBalancedStrings.balancedStringSplit("RRRRLLLL"));
    }

}