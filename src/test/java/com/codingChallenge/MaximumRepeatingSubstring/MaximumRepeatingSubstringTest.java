package com.codingChallenge.MaximumRepeatingSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumRepeatingSubstringTest {

    @Test
    void positiveTest(){
        assertEquals(2, MaximumRepeatingSubstring.maxRepeating("ababc", "ab"));
    }

    @Test
    void negativeTest(){
        assertNotEquals(3, MaximumRepeatingSubstring.maxRepeating("ababcab", "ab"));
    }

}