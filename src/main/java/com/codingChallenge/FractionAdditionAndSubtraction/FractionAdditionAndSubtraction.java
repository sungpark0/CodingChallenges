package com.codingChallenge.FractionAdditionAndSubtraction;

public class FractionAdditionAndSubtraction {

    public static String fractionAddition(String expression) {
        String[] calcResult = expression.split("(?=[+-])");
        int numerator = 0;
        int denominator = 1;

        for (String str : calcResult) {
            String[] fracSplit = str.split("/");
            int numer = Integer.parseInt(fracSplit[0]);
            int denom = Integer.parseInt(fracSplit[1]);

            numerator = numerator * denom + numer * denominator;
            denominator = denominator * denom;

            int gcd = gcdHelper(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
        }
        String sign = numerator < 0 || denominator < 0 ? "-" : "";

        return sign + Math.abs(numerator) + "/" + Math.abs(denominator);
    }

    public static int gcdHelper(int x, int y) {
        return x != 0 ? gcdHelper(y % x, x) : y;
    }


    public static void main(String[] args) {

    }
}
