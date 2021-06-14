package com.codingChallenge.DayOfTheWeek;

import java.time.LocalDate;

public class DayOfTheWeek {

    public static String dayOfTheWeek(int day, int month, int year) {
        String date = LocalDate.of(year, month, day).getDayOfWeek().toString();

        return date.substring(0, 1) + date.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

    }
}
