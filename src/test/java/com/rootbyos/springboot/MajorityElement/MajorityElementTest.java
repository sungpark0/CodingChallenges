package com.rootbyos.springboot.MajorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void positiveTest(){
        int[] test = {2,2,2,4};
        assertEquals( 2,MajorityElement.majorityElement( test ) );
    }

    @Test
    void negativeTest(){
        int[] test = {3,2,3};
        assertNotEquals( 2,MajorityElement.majorityElement( test ) );
    }

}