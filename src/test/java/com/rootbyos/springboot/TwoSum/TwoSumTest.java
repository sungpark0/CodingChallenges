package com.rootbyos.springboot.TwoSum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void positiveTest(int[] nums, int target){
        int[] numbs = {2,7,11,15};
        int[] answer = {0, 1};
        assertEquals(answer, TwoSum.twoSumHash(numbs, 9)  ) ;
    }

}