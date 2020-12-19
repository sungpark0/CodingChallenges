package com.codingChallenge.LengthOfLastWord;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @ParameterizedTest
    @ValueSource (strings = "Hi my name is Sungmin")
    void positiveTest (String str){
        assertEquals(7, LengthOfLastWord.lengthOfLastWord( str ));
    }

    @ParameterizedTest
    @ValueSource ( strings = "Hi today is Monday")
    void negativeTest (String str){
        assertNotEquals( 3, LengthOfLastWord.lengthOfLastWord( str ) );
    }

}