package com.codingChallenge.Citadel;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TripletsTest {

    @Test
    void positiveTest() {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) list.add(i);

        assertEquals(4, Triplets.triplets(8, list));
    }

    @Test
    void negativeTest() {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(1);
        list.add(3);

        assertNotEquals(3, Triplets.triplets(3, list));
    }
}