package com.codingChallenge.ShuffleTheArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {

    @Test
    void positiveTest() {
        int[] test = {1, 2, 3, 4, 5, 6};
        int[] shouldBe = {1, 4, 2, 5, 3, 6};
        assertArrayEquals(shouldBe, ShuffleTheArray.shuffle(test, 3));
    }

    @Test
    void negativeTest() {
        int[] test = {1, 2, 3, 4, 5, 6};
        int[] shouldBe = {1, 1, 1, 4, 3, 6};
        assertNotEquals(shouldBe, ShuffleTheArray.shuffle(test, 3));
    }

}