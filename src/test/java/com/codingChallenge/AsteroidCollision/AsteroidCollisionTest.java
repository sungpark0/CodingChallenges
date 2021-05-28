package com.codingChallenge.AsteroidCollision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{5, 10}, AsteroidCollision.asteroidCollision(new int[]{5, 10, -5}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{10, 2}, AsteroidCollision.asteroidCollision(new int[]{10, 2, -5}));
    }

}