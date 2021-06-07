package com.codingChallenge.ShoppingOptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingOptionsTest {

    @Test
    void positiveTest() {
        assertEquals(4, ShoppingOptions.shopping(new int[]{2, 3}, new int[]{4}, new int[]{2, 3}, new int[]{1, 2}, 10));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, ShoppingOptions.shopping(new int[]{2}, new int[]{4}, new int[]{2, 3}, new int[]{1, 2}, 5));
    }
}