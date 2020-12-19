package com.codingChallenge.DefangingAnIPAddress;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DefangIPAddrTest {

    @ParameterizedTest
    @ValueSource (strings = "1.1.1.1")
    void positiveTest(String str){
        assertEquals("1[.]1[.]1[.]1", DeFangIPAddress.defangIPAddress( str ));
    }

    @ParameterizedTest
    @ValueSource (strings = "255.100.50.0")
    void negativeTest(String str){
        assertNotEquals( "255.100.50.0", DeFangIPAddress.defangIPAddress( str ) );
    }


}