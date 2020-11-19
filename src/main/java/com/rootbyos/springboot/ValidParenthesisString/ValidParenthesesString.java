package com.rootbyos.springboot.ValidParenthesisString;

public class ValidParenthesesString {
    public static void main(String[] args) {

        String test = ")(";

        System.out.println(checkValidString(test));

    }

    public static boolean checkValidString(String s) {

        int counteropen = 0;
        int counterclose = 0;
        int asteriskCounter = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int index = 0;
            if (ch[i] == '(') {
                counteropen++;
                index = i;
            } else if (ch[i] == ')' && counteropen>0) {
                counterclose++;
            } else if (ch[i] == '*') {
                asteriskCounter++;
            }
        }
        System.out.println(counteropen);
        System.out.println(counterclose);
        System.out.println(asteriskCounter);
        if (counterclose == 1 && counteropen == 0) {
            return false;
        } else if ((counteropen + counterclose) % 2 != 0 && asteriskCounter % 2 != 0) {
            return true;
        } else if ((counteropen + counterclose) % 2 != 0 && asteriskCounter % 2 == 0) {
            return true;
        } else if ((counteropen + counterclose) % 2 == 0 && asteriskCounter % 2 != 0) {
            return true;
        } else if ((counteropen + counterclose) % 2 == 0 && asteriskCounter % 2 == 0) {
            return true;
        }

        return false;
    }
}
