package com.rootbyos.springboot.HeightChecker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckerTest {

    @Test
    void positiveTest() {
        int[] test = {5, 3, 3, 4, 5};
        assertEquals( 3, HeightChecker.heightChecker( test ) );
    }

    @Test
    void negativeTest() {
        int[] test = {1, 2, 3, 4, 5};
        assertNotEquals( 1, HeightChecker.heightChecker( test ) );
    }

}
//    @ParameterizedTest
//    @ValueSource (int[] arr = {5,3,3,4,5});
//    void jUnitTestOne