package com.codingChallenge.MinimumSwapsToMakeStringsEqual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsToMakeStringsEqualTest {

    @Test
    void positiveTest() {
        assertEquals(1, MinimumSwapsToMakeStringsEqual.minimumSwap("xx", "yy"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, MinimumSwapsToMakeStringsEqual.minimumSwap("xx", "xy"));
    }

}