package com.rootbyos.springboot.IntersectionOfTwoArraysII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysIITest {

    @Test
    void positiveTest() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] shouldBe = {2, 2};
        assertArrayEquals( shouldBe, IntersectionOfTwoArraysII.intersectFinal( nums1, nums2 ) );
    }

    @Test
    void negativeTest() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] shouldBe = {4};
        assertNotEquals( shouldBe, IntersectionOfTwoArraysII.intersectFinal( nums1, nums2 ) );
    }

}