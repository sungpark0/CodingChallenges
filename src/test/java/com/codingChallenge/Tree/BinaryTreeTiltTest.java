package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTiltTest {

    BinaryTreeTilt test = new BinaryTreeTilt();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        test.insertIteration(3);
        test.insertIteration(8);

        assertEquals(5, BinaryTreeTilt.findTilt(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(5);

        assertNotEquals(1, BinaryTreeTilt.findTilt(test.root));
    }

}