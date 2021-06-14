package com.codingChallenge.DayOfTheWeek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @Test
    void positiveTest(){
        assertEquals("Saturday", DayOfTheWeek.dayOfTheWeek(31, 8,2019));
    }

    @Test
    void negativeTest(){
        assertNotEquals("Friday", DayOfTheWeek.dayOfTheWeek(25, 8,2019));
    }

}