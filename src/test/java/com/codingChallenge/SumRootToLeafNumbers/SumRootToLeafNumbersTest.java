package com.codingChallenge.SumRootToLeafNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbersTest {

    SumRootToLeafNumbers test = new SumRootToLeafNumbers();

    @Test
    void positiveTest() {
        test.insertIteration(20);
        test.insertIteration(15);
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(25);
        test.insertIteration(30);

        assertEquals(23885, SumRootToLeafNumbers.sumNumbers(test.root));
    }
    

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(7);
        test.insertIteration(9);

        assertNotEquals(567, SumRootToLeafNumbers.sumNumbers(test.root));
    }

}