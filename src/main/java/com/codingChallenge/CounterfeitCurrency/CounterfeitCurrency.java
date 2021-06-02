package com.codingChallenge.CounterfeitCurrency;

import java.util.*;

/**
 * Counterfeit Currency:
 * <p>
 * A counterfeit currency printer is operating in country XYZ, and all of the banks must try to
 * identify the bad currency. Every note has a serial number that can be used to determine whether
 * it is valid. The serial number also can be used to determine the denomination of the notes.
 * A valid serial number will have the following characteristics:
 * <p>
 * 1. There are 10 to 12 characters.
 * 2. The first 3 characters are distinct uppercase English letter
 * 3. The next 4 characters represent the year the note was printed and will always be between 1900 and 2019 inclusive.
 * 4. The next characters represent the currency denomination and may be any one of {10, 20, 50, 100, 200, 500, 1000}
 * 5. The next character should be the last character of the serial number. The serial number mst end with exactly one uppercase English letter only.
 * <p>
 * Given an array of serial numbers, determine the value of the valid currency.
 * <p>
 * For example:
 * Serial Number: AVG190420T -> It passed all above 5 test cases so I get Amt as 20
 * Serial Number: RTF20001000Z -> It passed all above 5 test cases so I get Amt as 1000
 * Serial Number: QWER201850G -> It failed above 3rd test case so I get Amt as 0
 * Sample Output: Total valid amount = 1020
 * <p>
 * Function Description:
 * Complete the function countConterfeit in the editor below. The function must return an integer sum of values of valid currency.
 * countConterfeit has the following parameters:
 * serialNumber[serialNumber[0],….serialNumber[n-1]]: an array of strings
 * Solve in any language - Java, Python, Javascript (Node.js), C#, Go etc...
 */
public class CounterfeitCurrency {

    public static int countCounterfeit(List<String> serialNumbers) {
        int total = 0;

        HashSet<Integer> currencies = generateCurrencyHashSet();

        for (String serial : serialNumbers) {
            if (serial.length() >= 10 && serial.length() <= 12) {
                String letters = serial.substring(0, 3);
                String year = serial.substring(3, 7);
                String last = serial.substring(serial.length() - 1, serial.length());

                if (isItLetter(letters) && validYear(year) && (last.charAt(0) >= 'A' && last.charAt(0) <= 'Z')) {
                    int amount = Integer.parseInt(serial.substring(7, serial.length() - 1));

                    if (currencies.contains(amount)) total += amount;
                }
            }
        }

        return total;
    }

    public static boolean validYear(String year) {
        for (char ch : year.toCharArray()) if (!Character.isDigit(ch)) return false;

        int yr = Integer.parseInt(year);

        return yr >= 1900 && yr <= 2019;
    }

    public static boolean isItLetter(String letters) {
        Set<Character> isDistinct = new HashSet<>();
        for (char ch : letters.toCharArray()) {
            if ((ch < 'A' || ch > 'Z') || isDistinct.contains(ch)) return false;
            else isDistinct.add(ch);
        }
        return true;
    }

    public static HashSet<Integer> generateCurrencyHashSet() {
        return new HashSet<>() {{
            add(10);
            add(20);
            add(50);
            add(100);
            add(200);
            add(500);
            add(1000);
        }};
    }


//    public static int countCounterfeit(List<String> serialNumbers) {
//        List<Integer> amounts = new ArrayList<>();
//        int total = 0;
//        Integer[] prices = new Integer[]{10, 20, 50, 100, 200, 500, 1000};
//
//        for (String serial : serialNumbers) {
//            if (serial.length() >= 10 && serial.length() <= 12) {
//                String letters = serial.substring(0, 3);
//                String year = serial.substring(3, 7);
//                String last = serial.substring(serial.length() - 1, serial.length());
//                if (isItLetter(letters) && validYear(year) && (last.charAt(0) >= 'A' && last.charAt(0) <= 'Z')) {
//                    int currency = Integer.parseInt(serial.substring(7, serial.length() - 1));
//                    for (int price : prices) {
//                        if (price == currency) {
//                            amounts.add(price);
//                        }
//                    }
//                }
//            }
//        }
//        for (int amount : amounts) total += amount;
//
//        return total;
//    }
//
//    public static boolean validYear(String year) {
//        for (char ch : year.toCharArray()) if (!Character.isDigit(ch)) return false;
//
//        int yr = Integer.parseInt(year);
//
//        return yr >= 1900 && yr <= 2019;
//    }
//
//    public static boolean isItLetter(String letters) {
//        Set<Character> isDistinct = new HashSet<>();
//        for (char ch : letters.toCharArray()) {
//            if ((ch < 'A' || ch > 'Z') || isDistinct.contains(ch)) return false;
//            else isDistinct.add(ch);
//        }
//        return true;
//    }

    public static void main(String[] args) {
        System.out.println(countCounterfeit(List.of(
                "AVG190420T", "RTF20001000Z", "QWER201850G", "AFA199620E", "ERT1947200T", "RTY20202004", "DRV1984500Y", "ETB2010400G")
        ));

    }
}
