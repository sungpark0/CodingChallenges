package com.rootbyos.springboot.SingleNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void positiveTest(){
        int[] test = {2,2,1};
        assertEquals(1, SingleNumber.singleNumber( test ));
    }

    @Test
    void negativeTest(){
        int[] test = {4,1,2,1,2};
        assertNotEquals( 1, SingleNumber.singleNumber( test ) );
    }

}