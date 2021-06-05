package com.codingChallenge.TagIdentificationNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TagIdentificationNumberTest {

    @Test
    void positiveTest(){
        assertEquals(2, TagIdentificationNumber.numOfIds("0011223344556677889988"));
    }

    @Test
    void negativeTest(){
        assertNotEquals(1, TagIdentificationNumber.numOfIds("12345677910"));
    }

}