package com.rootbyos.springboot.StringMatchingInAnArray;

import java.util.*;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        String[] test = {"mass", "as", "as", "hero", "superhero"};

        System.out.println( stringMatching( test ) );
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
}
