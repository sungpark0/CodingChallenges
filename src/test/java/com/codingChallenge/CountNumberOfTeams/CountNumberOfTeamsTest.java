package com.codingChallenge.CountNumberOfTeams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNumberOfTeamsTest {

    @Test
    void positiveTest() {
        int[] test = {2, 5, 3, 4, 1};
        assertEquals(3, CountNumberOfTeams.numTeams(test));
    }

    @Test
    void negativeTest() {
        int[] test = {1, 2, 3, 4};
        assertNotEquals(2, CountNumberOfTeams.numTeams(test));
    }

}