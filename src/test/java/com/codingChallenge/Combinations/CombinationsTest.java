package com.codingChallenge.Combinations;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    @Test
    void positiveTest() {
        assertEquals(List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4)), Combinations.combine(4, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of(List.of(1, 2, 3)), Combinations.combine(3, 2));
    }

}