package com.codingChallenge.DetermineColorOfAChessboardSquare;

public class DetermineColorOfAChessboardSquare {

    public static boolean squareIsWhite(String coordinates) {
        char[] sChar = coordinates.toCharArray();

        if (sChar[0] == 'a' || sChar[0] == 'c' || sChar[0] == 'e' || sChar[0] == 'g') {
            if (sChar[1] == '1') return false;
            else if (sChar[1] % 2 != 0) return false;
            else return true;
        } else {
            if (sChar[1] == '1') return true;
            else if (sChar[1] % 2 != 0) return true;
        }

        return false;
    }



    public static void main(String[] args) {

    }
}
