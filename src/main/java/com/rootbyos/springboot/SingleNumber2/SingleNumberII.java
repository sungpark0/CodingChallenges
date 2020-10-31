package com.rootbyos.springboot.SingleNumber2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleNumberII {

    public static void main(String[] args) {

        int[] test = {2, 2, 3, 2};
        System.out.println( singleNumberIV( test ) );
    }

    public static int singleNumber(int[] nums) {

        Arrays.sort( nums );

        for (int i = 0; i < nums.length - 2; i += 3) {
            if (nums[i] != nums[i + 1] && nums[i] != nums[i + 2]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    private static int singleNumberTwo(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey( num )) {
                map.put( num, map.get( num ) + 1 );
            } else {
                map.put( num, 1 );
            }
        }

        // Notice how Intellij is highlighting .get() on line 58? Why is that?  Why don't we want to use .get() for this method?
        return map.entrySet()
                .stream()
                .filter( entry -> entry.getValue() == 1 )
                .map( Map.Entry::getKey )
                .findFirst().get();
        //highlight is warning us what if there is nothing in the array. Null pointer.

        //We dont want to use .get for this method is because i think we can only get the first element from the list and in case if we want to
        //get() different elements from the list.
    }

    /**
     * Example II
     */

    private static int getKey(Map<Integer, Integer> map) {
        return map.entrySet()
                .stream()
                .filter( entry -> entry.getValue() == 1 )
                .map( Map.Entry::getKey )
                .collect( Collectors.toList() ).get(0);
    }

    /**
     * Example III
     */
    private static int singleNumberIII(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        //2 2 2 3 4 4 2 4
        /**
         * {
         *   3:1
         *   }
         */
        for (int num : nums) {
            if (map.containsKey( num )) {
                int counter = map.get( num );

                if (counter == 2) {
                    map.remove( num );
                } else {
                    map.put( num, map.get( num ) + 1 );
                }
            } else {
                map.put( num, 1 );
            }
        }

        return map.keySet().toArray( new Integer[0] )[0];
    }//[3][0] = 3
    /** End of Example III */

    /**
     * Example IV
     */
    private static int singleNumberIV(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey( num )) {
                int counter = map.get( num );

                if (counter == 2) {
                    map.remove( num );
                } else {
                    map.put( num, map.get( num ) + 1 );
                }
            } else {
                map.put( num, 1 );
            }
        }
        return new ArrayList<>( map.keySet() ).get( 0 );
    }
}
