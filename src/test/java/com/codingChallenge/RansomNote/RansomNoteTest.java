package com.codingChallenge.RansomNote;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @ParameterizedTest
    @ValueSource (strings = "aa")
    void positiveTest(String ransom){
        String mag = "aab";
        assertEquals(true, RansomNote.canConstruct( ransom, mag ));
    }

    @ParameterizedTest
    @ValueSource (strings = "aa")
    void negativeTest(String ransom){
        String mag = "aca";
        assertNotEquals(false, RansomNote.canConstruct( ransom, mag ));
    }
}