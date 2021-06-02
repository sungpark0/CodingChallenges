package com.codingChallenge.CustomSortedArray;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortedArrayTest {

    @Test
    void positiveTest() {
        assertEquals(2, CustomSortedArray.moves(List.of(2, 1, 3, 5, 4, 6)));
    }

    @Test
    void negativeTest() {
        assertNotEquals(3, CustomSortedArray.moves(List.of(6, 3, 5, 2, 7, 4, 5)));
    }

}