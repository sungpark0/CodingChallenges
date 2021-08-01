package com.codingChallenge.NextPermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void positiveTest() {
        int[] test = new int[]{1, 2, 3};
        NextPermutation.nextPermutation(test);
        assertArrayEquals(new int[]{1, 3, 2}, test);
    }

    @Test
    void negativeTest() {
        int[] test = new int[]{1, 1, 5};
        NextPermutation.nextPermutation(test);
        assertNotEquals(new int[]{5, 1, 1}, test);
    }

    @Test
    void positiveTestII() {
        int[] test = new int[]{3, 2, 1};
        NextPermutation.nextPermutation(test);
        assertArrayEquals(new int[]{1, 2, 3}, test);
    }

    @Test
    void negativeTestII() {
        int[] test = new int[]{1, 1, 0};
        NextPermutation.nextPermutation(test);
        assertNotEquals(new int[]{1, 0, 1}, test);
    }

}