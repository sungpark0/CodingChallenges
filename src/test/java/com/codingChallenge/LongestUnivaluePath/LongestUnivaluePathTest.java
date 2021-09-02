package com.codingChallenge.LongestUnivaluePath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestUnivaluePathTest {

    LongestUnivaluePath test = new LongestUnivaluePath();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        test.insertIteration(10);
        test.insertIteration(15);

        assertEquals(0, LongestUnivaluePath.longestUnivaluePath(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(10);

        assertNotEquals(2, LongestUnivaluePath.longestUnivaluePath(test.root));
    }

}