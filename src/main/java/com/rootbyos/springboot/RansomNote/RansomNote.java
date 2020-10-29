package com.rootbyos.springboot.RansomNote;

import java.util.*;

public class RansomNote {

    public static void main(String[] args) {

        String a = "aa";
        String b = "aab";
        canConstruct( a, b );
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] ransomArr = ransomNote.toCharArray();
        Arrays.sort( ransomArr );
        char[] magArr = magazine.toCharArray();
        Arrays.sort( magArr );
        char[] result = new char[ransomArr.length];

        for(int i =0; i< ransomArr.length; i++){
            for(int j=0; j<magArr.length; j++){
                if(ransomArr[i]==magArr[j]){
                    result[i] = ransomArr[i];
                    magArr[j]= 0;
                }
            }
        }
        System.out.println(Arrays.toString( result ));
        System.out.println(Arrays.toString( ransomArr ));
        if (Arrays.equals( result, ransomArr )) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;

        }
    }
}
