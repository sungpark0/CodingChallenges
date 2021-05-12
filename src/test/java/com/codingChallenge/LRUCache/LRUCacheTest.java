package com.codingChallenge.LRUCache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    LRUCache test = new LRUCache();

    @Test
    void positiveTest() {
        assertEquals(-1, test.get(4));
    }

    @Test
    void negativeTest() {
        test.put(1, 4);
        assertNotEquals(-1, test.get(1));
        //Testing put works
        assertEquals(4, test.get(1));
    }

}