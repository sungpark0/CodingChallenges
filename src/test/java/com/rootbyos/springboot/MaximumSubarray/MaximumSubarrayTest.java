package com.rootbyos.springboot.MaximumSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void positiveTest(){
        int [] test = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, MaximumSubarray.maximumSubarray(test));
    }

    @Test
    void negative(){
        int [] test = {-4,20,5,3};
        assertNotEquals(1, MaximumSubarray.maximumSubarray(test));
    }

}