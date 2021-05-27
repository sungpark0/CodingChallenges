package com.codingChallenge.MinimumDifficultyOfAJobSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDifficultyOfAJobScheduleTest {

    @Test
    void positiveTest() {
        assertEquals(15, MinimumDifficultyOfAJobSchedule.minDifficulty(new int[]{7, 1, 7, 1, 7, 1}, 3));
    }

    @Test
    void negativeTest(){
        assertNotEquals(-1, MinimumDifficultyOfAJobSchedule.minDifficulty(new int[]{1,1,1}, 3));
    }

}