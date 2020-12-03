package com.rootbyos.springboot.HowManyNumbersAreSmallerThanTheCurrentNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

    @Test
    void positiveTest() {
        int[] test = {8, 1, 2, 2, 3};
        int[] shouldBe = {4, 0, 1, 1, 3};
        assertArrayEquals(shouldBe, HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(test));
    }

    @Test
    void negativeTest() {
        int[] test = {6, 5, 4, 8};
        int[] shouldBe = {1, 2, 3, 4};
        assertNotEquals(shouldBe, HowManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(test));
    }

}