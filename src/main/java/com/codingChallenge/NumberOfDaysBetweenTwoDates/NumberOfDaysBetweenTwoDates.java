package com.codingChallenge.NumberOfDaysBetweenTwoDates;

public class NumberOfDaysBetweenTwoDates {

    public static int daysBetweenDates(String date1, String date2) {
        String[] dateOne = date1.split("-");
        String[] dateTwo = date2.split("-");

        return Math.abs(
                julianCalendar(Integer.parseInt(dateOne[0]), Integer.parseInt(dateOne[1]), Integer.parseInt(dateOne[2]))
                        - julianCalendar(Integer.parseInt(dateTwo[0]), Integer.parseInt(dateTwo[1]), Integer.parseInt(dateTwo[2]))
        );
    }

    public static int julianCalendar(int year, int month, int day) {
        int janFeb = (14 - month) / 12;
        year = year + 4800 - janFeb;
        month = month + 12 * janFeb - 3;
        return day + (153 * month + 2) / 5 + 365 * year + year / 4 - year / 100 + year / 400 - 32045;
    }

    public static void main(String[] args) {

    }
}
