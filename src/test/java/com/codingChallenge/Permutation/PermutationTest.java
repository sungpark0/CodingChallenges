package com.codingChallenge.Permutation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    @Test
    void positiveTest() {
        int[] test = new int[]{1, 2, 3};
        assertEquals(List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)), Permutation.permute(test));
    }

    @Test
    void negativeTest() {
        int[] test = new int[]{1, 2};
        assertNotEquals(List.of(List.of(1, 2)), Permutation.permute(test));
    }

}