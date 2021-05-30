package com.codingChallenge.ReorganizeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorganizeStringTest {

    @Test
    void positiveTest(){
        assertEquals("aba", ReorganizeString.reorganizeString("aab"));
    }

    @Test
    void negativeTest(){
        assertNotEquals(" ", ReorganizeString.reorganizeString("aaba"));
    }

}