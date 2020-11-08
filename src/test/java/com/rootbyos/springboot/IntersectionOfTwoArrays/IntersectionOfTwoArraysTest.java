package com.rootbyos.springboot.IntersectionOfTwoArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    @Test
    void positiveTest(){
        int[] testOne={1,2,2,1};
        int[] testTwo={2,2};
        int[] shouldBe = {2};
        assertArrayEquals(shouldBe, IntersectionOfTwoArrays.intersection( testOne,testTwo ) );
    }

    @Test
    void negativeTest(){
        int[] testOne={4,9,5};
        int[] testTwo={9,4,9,8,4};
        int[] shouldBe = {1};
        assertNotEquals(shouldBe, IntersectionOfTwoArrays.intersection( testOne,testTwo ) );
    }

}