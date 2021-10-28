package com.codingChallenge.ArrayPartitionI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPartitionITest {

    @Test
    void positiveTest() {
        assertEquals(4, ArrayPartitionI.arrayPairSum(new int[]{1, 4, 3, 2}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(5, ArrayPartitionI.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }

}