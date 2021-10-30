package com.codingChallenge.DIStringMatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DIStringMatchTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, DIStringMatch.diStringMatch("IDID"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{3, 2, 0, 0}, DIStringMatch.diStringMatch("DDI"));
    }

}