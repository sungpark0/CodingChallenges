package com.rootbyos.springboot.RunningSumOf1DArray;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1DArrayTest {

    @Test
    void positiveTest(){
        int[] test = {1,2,3,4,5};
        int[] shouldBe = {1,3,6,10,15};
        assertArrayEquals(shouldBe, RunningSumOf1DArray.runningSum(test));
    }

    @Test
    void negativeTest(){
        int[] test= {1,2,3,10};
        int[] shouldBe = {1,3,6,10};
        assertNotEquals(shouldBe, RunningSumOf1DArray.runningSum(test));
    }

}