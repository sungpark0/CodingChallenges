package com.rootbyos.springboot.ValidParentheses;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String test = "()";
        System.out.println(isValid(test));
        String test1 = "(]";
        System.out.println(isValid(test1));
        String test2 = "{[]}";
        System.out.println(isValid(test2));
    }

    public static boolean isValid(String s) {

//        for(int i =0; i<s.length()-1; i++){
//            if(s.charAt(i)=='('){
//                for(int j=i; j<s.length()-1; j++){
//                    if(s.charAt(j)!=')'){
//                        return false;
//                    }
//                }
//            }
//        }
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;
                if (ch == ')') {
                    if ('(' != stack.pop())
                        return false;
                } else if (ch == ']') {
                    if ('[' != stack.pop())
                        return false;
                } else if (ch == '}') {
                    if ('{' != stack.pop())
                        return false;
                }
            }
        }
        return stack.isEmpty();

    }
}

