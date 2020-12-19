package com.codingChallenge.ContainDuplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainDuplicateTest {

    @Test
    void posituveTest(){
        int[] test = {2,2,3,4,5,5};
        assertEquals(true, ContainDuplicate.containDuplicate( test ));
    }

    @Test
    void negativeTest(){
        int[] test = {1,2,3,4,5};
        assertNotEquals( true, ContainDuplicate.containDuplicate( test ) );
    }

}