package com.codingChallenge.ThreeSum;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void positiveTest() {
        int[] test = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> shouldBe = asList(asList(-1, -1, 2), asList(-1, 0, 1));
        assertEquals(shouldBe, ThreeSum.threeSum(test));
    }

    @Test
    void negativeTest() {
        int[] test = {0};
        List<List<Integer>> shouldnBe = Collections.singletonList(asList(0, 0, 0));
        assertNotEquals(shouldnBe, ThreeSum.threeSum(test));
    }
}
