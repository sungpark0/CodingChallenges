package com.codingChallenge.SumOfRootToLeafBinaryNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfRootToLeafBinaryNumbersTest {

    SumOfRootToLeafBinaryNumbers test = new SumOfRootToLeafBinaryNumbers();

    @Test
    void positiveTest() {
        test.insertIteration(1);
        test.insertIteration(0);

        assertEquals(2, SumOfRootToLeafBinaryNumbers.sumRootToLeaf(test.root));
    }

    @Test
    void negative() {
        test.insertIteration(1);

        assertNotEquals(10, SumOfRootToLeafBinaryNumbers.sumRootToLeaf(test.root));
    }

}