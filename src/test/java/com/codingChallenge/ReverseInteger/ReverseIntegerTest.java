package com.codingChallenge.ReverseInteger;

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

    @ParameterizedTest
    @ValueSource (ints = 1234567 )
    void positiveTestStack (int num){
        assertEquals(7654321, ReverseInteger.reverseIntegerStack( num )  );
    }

    @ParameterizedTest
    @ValueSource (ints = 1534236469)
        void negativeTestStack (int num){
        assertNotEquals( 1534236469, ReverseInteger.reverseIntegerStack( num ) );
    }
}

