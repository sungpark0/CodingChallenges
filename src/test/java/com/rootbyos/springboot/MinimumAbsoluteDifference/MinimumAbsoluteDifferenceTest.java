package com.rootbyos.springboot.MinimumAbsoluteDifference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAbsoluteDifferenceTest {

    @Test
    void positiveTest() {
        int[] test = {1, 3, 6, 10, 15};
        List<List<Integer>> shouldBe = new ArrayList<>();
        shouldBe.add( Arrays.asList( 1, 3 ) );
        assertEquals( shouldBe, MinimumAbsoluteDifference.minimumAbsDifference( test ) );
    }

    @Test
    void negativeTest() {
        int[] test = {3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> shouldBe = new ArrayList<>();
        shouldBe.add( Arrays.asList( 19, 23 ) );
        assertNotEquals( shouldBe, MinimumAbsoluteDifference.minimumAbsDifference( test ) );
    }

    @Test
    void positiveTestII() {
        int[] test = {1, 3, 6, 10, 15};
        List<List<Integer>> shouldBe = new ArrayList<>();
        shouldBe.add( Arrays.asList( 1, 3 ) );
        assertEquals( shouldBe, MinimumAbsoluteDifference.minimumAbsDifferenceII( test ) );
    }

    @Test
    void negativeTestII() {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 10};
        List<List<Integer>> shouldBe = new ArrayList<>();
        shouldBe.add( Arrays.asList( 1, 4 ) );
        assertNotEquals( shouldBe, MinimumAbsoluteDifference.minimumAbsDifferenceII( test ) );
    }

}