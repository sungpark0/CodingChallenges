package com.codingChallenge.NumberOfDaysBetweenTwoDates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysBetweenTwoDatesTest {

    @Test
    void positiveTest(){
        assertEquals(1, NumberOfDaysBetweenTwoDates.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    void negativeTest(){
        assertNotEquals(45, NumberOfDaysBetweenTwoDates.daysBetweenDates("2020-01-15", "2019-12-31"));
    }

}