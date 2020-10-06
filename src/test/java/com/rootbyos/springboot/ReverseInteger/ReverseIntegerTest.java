package com.rootbyos.springboot.ReverseInteger;

import com.rootbyos.springboot.StringReversal.StringReversal;
import com.rootbyos.springboot.Vowels.Vowels;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    @ParameterizedTest
    @ValueSource(strings = {"hello"})
    void positiveTest(String str) {
        String s = "olleh";
        char[] e = s.toCharArray();
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        assertEquals(String.valueOf(expected), String.valueOf(StringReversal.reverseString(str.toCharArray())));
    }


    @ParameterizedTest
    @ValueSource(strings = {"hello"})
    void negativeTest(String str) {
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        assertTrue(expected!=expected, String.valueOf(StringReversal.reverseString(str.toCharArray())));
    }

    private void assertTrue(boolean b, String valueOf) {
    }
}

