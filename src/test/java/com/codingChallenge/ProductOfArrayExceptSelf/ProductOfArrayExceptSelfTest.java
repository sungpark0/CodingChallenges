package com.codingChallenge.ProductOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{-1, -1, 0, -3, 3}, ProductOfArrayExceptSelf.productExceptSelf(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    void positiveTestII() {
        assertArrayEquals(new int[]{6, 3, 2}, ProductOfArrayExceptSelf.productExceptSelfII(new int[]{1, 2, 3}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(new int[]{1, 1, 0, 1}, ProductOfArrayExceptSelf.productExceptSelfII(new int[]{0, 0, 1, 0}));
    }

    @Test
    void positiveTestIII() {
        assertArrayEquals(new int[]{1000, 200, 100, 50}, ProductOfArrayExceptSelf.productExceptSelfII(new int[]{1, 5, 10, 20}));
    }

    @Test
    void negativeTestIII() {
        assertNotEquals(new int[]{15, 5, 3}, ProductOfArrayExceptSelf.productExceptSelfII(new int[]{1, 3, 5}));
    }

}