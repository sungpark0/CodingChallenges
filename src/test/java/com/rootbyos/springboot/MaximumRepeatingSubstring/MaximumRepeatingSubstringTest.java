package com.rootbyos.springboot.MaximumRepeatingSubstring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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