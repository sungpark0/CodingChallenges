package com.codingChallenge.GoatLatin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoatLatinTest {

    @Test
    void positiveTest() {
        assertEquals("Imaa peakSmaaa oatGmaaaa atinLmaaaaa", GoatLatin.toGoatLatin("I Speak Goat Latin"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("heTmaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
                , GoatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}