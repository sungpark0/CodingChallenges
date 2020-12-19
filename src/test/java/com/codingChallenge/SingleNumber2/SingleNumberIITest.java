package com.codingChallenge.SingleNumber2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIITest {

    @Test
    void positiveTest(){
        int[] test = {2,2,3,2};
        assertEquals(3, SingleNumberII.singleNumber( test ));
    }

    @Test
    void negativeTest(){
        int[] test = {2,2,2,3};
        assertNotEquals(4, SingleNumberII.singleNumber( test ));
    }


}