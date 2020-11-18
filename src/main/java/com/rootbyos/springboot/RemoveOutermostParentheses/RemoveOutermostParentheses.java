package com.rootbyos.springboot.RemoveOutermostParentheses;

import java.util.*;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {

        String test = "(()())(())";
        String testIndex = "( ( ) ( ) ) ( ( ) )";
        //                  0 1 2 3 4 5 6 7 8 9
        System.out.println(removeOuterParentheses(test) + " should be ()()()");

    }

    public static String removeOuterParentheses(String S) {

        StringBuilder str = new StringBuilder();
        int matches = 0;
        int start=0;
        for (char ch : S.toCharArray())
            if (ch == '(') {
                if (matches != 0) {
                    str.append(ch);
                }
                matches++;
            } else if (ch == ')') {
                matches--;
                if (matches != 0) {
                    str.append(ch);
                }
//            if(matches ==0){
//                str.append(new String( start+1, i-1));
//            }
            }

        return str.toString();
    }
}
