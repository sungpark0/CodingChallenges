package com.rootbyos.springboot.FlippingAnImage;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlippingAnImageTest {

    @Test
    void positiveTest() {
        int[][] test = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] shouldBe = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        assertEquals( Arrays.deepToString( shouldBe ), Arrays.deepToString( FlippingAnImage.flipAndInvertImage( test ) ) );
    }

    @Test
    void negativeTest() {
        int[][] test = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] shouldBe = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        assertNotEquals( Arrays.deepToString( shouldBe ), Arrays.deepToString( FlippingAnImage.flipAndInvertImage( test ) ) );
    }
}