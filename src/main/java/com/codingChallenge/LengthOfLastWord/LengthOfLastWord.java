package com.codingChallenge.LengthOfLastWord;

import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String test = "hell world";
        System.out.println( lengthOfLastWord( test ) );
    }

    public static int lengthOfLastWord(String s) {
        String[] splitSentence = s.split( " " ); // splitting the sentence into an array
        if (splitSentence.length == 0) return 0; //if array is empty because string s is empty, return 0
//        splitSentence.length==0 ? return 0 : (? );
        String lastWord = splitSentence[splitSentence.length - 1]; //inputting last word into String lastWord


        return lastWord.length();
    }
}
