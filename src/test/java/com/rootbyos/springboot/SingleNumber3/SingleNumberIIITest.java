package com.rootbyos.springboot.SingleNumber3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberIIITest {

    @Test
    void positiveTest() {
        int[] nums = {-1, 0, 1, 2, 1, 3, 2, 5};
        int[] shouldBe = {-1, 0, 3, 5};
        assertArrayEquals( shouldBe, SingleNumberIII.singleNumberIII( nums ) );
    }

    @Test
    void negativeTest() {
        int[] nums = {-1, 0, 1, 2, 1, 3, 2, 5};
        int[] negTest ={5};
        assertNotEquals( negTest, SingleNumberIII.singleNumberIII( nums ) );
    }
}