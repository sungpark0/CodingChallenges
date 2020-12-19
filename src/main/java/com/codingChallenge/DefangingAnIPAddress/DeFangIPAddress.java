package com.codingChallenge.DefangingAnIPAddress;

import java.util.*;

public class DeFangIPAddress {
    public static void main(String[] args) {

        String test = "255.100.50.0";
        System.out.println( defangIPAddress( test ) );
    }

    public static String defangIPAddress(String address) {

        String[] word = address.split( " " );
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>( Arrays.asList( address.split( "" ) ) );

//        System.out.println( Arrays.toString( word ) + "hello" );
//        System.out.println( Arrays.toString( word ) + "hi" );
//        System.out.println( list + "bye" );


        return address.replace( ".", "[.]" );
    }

}
