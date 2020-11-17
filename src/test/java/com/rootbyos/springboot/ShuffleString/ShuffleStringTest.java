package com.rootbyos.springboot.ShuffleString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {

    @ParameterizedTest
    @ValueSource (strings = "codeleet")
    void positiveTest(String str){
        int[] indices = {4,5,6,7,0,2,1,3};
        assertEquals("leetcode", ShuffleString.restoreString(str, indices));
    }

    @ParameterizedTest
    @ValueSource (strings = "ahnyoung")
    void negativeTest(String str){
        int[] indices = {4,2,1,3,5,6,0,7};
        assertNotEquals("ahnyoung", ShuffleString.restoreString(str, indices));
    }

}