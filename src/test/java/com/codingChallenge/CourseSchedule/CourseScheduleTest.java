package com.codingChallenge.CourseSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    @Test
    void positiveTest() {
        assertTrue(CourseSchedule.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    void negativeTest() {
        assertFalse(CourseSchedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

}