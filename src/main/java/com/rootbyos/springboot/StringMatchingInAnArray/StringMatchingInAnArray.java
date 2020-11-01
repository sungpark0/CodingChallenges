package com.rootbyos.springboot.StringMatchingInAnArray;

import java.util.*;
import java.util.stream.Collectors;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        String[] test = {"mass", "as", "as", "hero", "superhero"};

        System.out.println( stringMatching( test ) );
        System.out.println( stringMatchingTwo( test ) );
    }

    public static List<String> stringMatching(String[] words) {

        List<String> holder = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].contains( words[j] ) && i != j && !holder.contains( words[j] )) {
                    holder.add( words[j] );
                }
            }
        }
        return holder;
    }

    public static List<String> stringMatchingTwo(String[] words) {

        List<String> answer = new ArrayList<>();
        Stack<String> temp = new Stack<>();

        for (String a : words) {
            for (String b : words) {
                if (!a.equals( b ) && a.contains( b )) {
                    answer.add( b );
                }
            }
        }

        Collections.sort( answer );

        for (String i : answer) {
            if (temp.isEmpty()) {
                temp.add( i );
            } else {
                if (temp.lastElement().equals( i )) {
                    temp.add( i );
                    temp.pop();
                } else {
                    temp.add( i );
                }
            }
        }

        return new ArrayList<>( temp );

//        Stack <String> practice = new Stack<>();
//        Arrays.sort(words);
//        for(String a : words){
//            for(String b: words){
//                if(!a.equals(b) && a.contains(b) ){
//                    practice.add(b);
//                }
//                if(practice.isEmpty()){
//                    int dump =0;
//                    dump++;
//                }
//                else if(practice.lastElement()==a){
//                    practice.pop();
//                    practice.add(b);
//                }
//            }
//
//        }
//                return new ArrayList<>( practice );

    }
}
