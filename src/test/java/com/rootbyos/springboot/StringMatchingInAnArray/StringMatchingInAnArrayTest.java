package com.rootbyos.springboot.StringMatchingInAnArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringMatchingInAnArrayTest {

    @Test
    void positiveTest() {
        String[] test = {"leetcode", "et", "code"};
        List<String> result = Arrays.asList( "et", "code" );
        assertEquals( result, StringMatchingInAnArray.stringMatching( test ) );
    }

    @Test
    void negativeTest() {
        String[] test = {"blue", "green", "bu"};
        List<String> result = Arrays.asList( "hi" );
        assertNotEquals( result, StringMatchingInAnArray.stringMatching( test ) );
    }

    @Test
    void negativeTestRepeatWords() {
        String[] test = {"leetcode", "et", "et", "code"};
        List<String> result = Arrays.asList(  "et", "code" );
        assertEquals( result, StringMatchingInAnArray.stringMatching( test ) );
    }
}