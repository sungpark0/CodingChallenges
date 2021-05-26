package com.codingChallenge.InsertDeleteGetRandom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetRandomTest {

    InsertDeleteGetRandom test = new InsertDeleteGetRandom();

    @Test
    void positiveTest(){
        assertTrue(test.insert(3));
        assertEquals(3, test.getRandom());
    }

    @Test
    void negativeTest(){
        assertFalse(test.remove(1));
    }

}