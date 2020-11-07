package com.rootbyos.springboot.RomanToInteger;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @ParameterizedTest
    @ValueSource (strings = "LVIII")
    void positiveTest(String str){
        assertEquals(58, RomanToInteger.romanToInt( str ));
    }

    @ParameterizedTest
    @ValueSource (strings = "III")
    void negativeTest(String str){
        assertNotEquals(100, RomanToInteger.romanToInt( str ));
    }

}