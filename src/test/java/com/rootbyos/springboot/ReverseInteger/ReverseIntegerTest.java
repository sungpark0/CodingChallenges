package com.rootbyos.springboot.ReverseInteger;

import com.rootbyos.springboot.StringReversal.StringReversal;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ReverseIntegerTest {

    @ParameterizedTest
    @ValueSource (ints = -12345)
    void positiveTest (int testNum){
        assertEquals(-54321, ReverseInteger.reverse(testNum));
    }

    @ParameterizedTest
    @ValueSource(ints = 214)
    void negativeTest ( int testNum){
        assertNotEquals(214, ReverseInteger.reverse(testNum)); //Not sure about this negative test.
    }

}

