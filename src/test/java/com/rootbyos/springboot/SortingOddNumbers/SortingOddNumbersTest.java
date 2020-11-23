package com.rootbyos.springboot.SortingOddNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingOddNumbersTest {

    @Test
    void positiveTest() {
        int[] test = new int[]{5, 3, 2, 8, 1, 4};
        int[] shouldBe = new int[]{1, 3, 2, 8, 5, 4};
        assertArrayEquals(shouldBe, SortingOddNumbers.sortOdds(test));
    }

    @Test
    void negativeTest() {
        int[] test = new int[]{5, 3, 2, 8, 1, 4};
        int[] shouldBe = new int[]{1, 3, 2};
        assertNotEquals(shouldBe, SortingOddNumbers.sortOdds(test));
    }

}