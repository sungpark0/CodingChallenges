package com.rootbyos.springboot.ReverseVowels;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    @ParameterizedTest
    @ValueSource (strings = "hello friends")
    void positiveTest(String str){
        assertEquals("helli froends", ReverseVowels.reverseVowels( str ));
    }

    @ParameterizedTest
    @ValueSource (strings = "Today is Sunday")
    void negativeTest(String str){
        assertNotEquals("Today is Sunday", ReverseVowels.reverseVowels( str )  );
    }


}