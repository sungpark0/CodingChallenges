package com.rootbyos.springboot.SingleNumber3;

import java.util.*;
import java.util.stream.IntStream;

public class SingleNumberIII {
    public static void main(String[] args) {

        int[] test = {1, 2, 1, 3, 2, 5};
        System.out.println( Arrays.toString( singleNumberIII( test ) ) );
        System.out.println( Arrays.toString( singleNumberIIITwo( test ) ) );
        System.out.println( Arrays.toString( singleNumberIIIThree( test ) ) );
        System.out.println( Arrays.toString( singleNumberIIIFour( test ) ) );
        System.out.println( Arrays.toString( singleNumberIIIFive( test ) ) );
        System.out.println( Arrays.toString( singleNumberIIISix( test ) ) );
    }

    public static int[] singleNumberIII(int[] nums) {

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            if (hm.containsKey( i )) {
                int counter = hm.get( i );

                if (counter == 1) {
                    hm.remove( i );
                } else {
                    hm.put( i, hm.get( i ) + 1 );
                }
            } else {
                hm.put( i, 1 );
            }
        }

        return hm.keySet().stream().flatMapToInt( IntStream::of ).toArray();
    }

    /**
     * Example I
     */
    public static int[] singleNumberIIITwo(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey( num )) {
                map.put( num, 1 );

            } else {
                map.put( num, map.get( num ) + 1 );
            }
        }

        return map.entrySet().stream().filter( v -> v.getValue() == 1 ).map( Map.Entry::getKey ).mapToInt( i -> i ).toArray();
    }

    /**
     * Example II
     */
    public static int[] singleNumberIIIThree(int[] nums) {
        Stack<Integer> list = new Stack<>();
        Arrays.sort( nums );

        for (int num : nums) {
            if (list.isEmpty()) {
                list.add( num );
            } else {
                if (list.lastElement() == num) {
                    list.pop();
                } else {
                    list.add( num );
                }
            }

        }

        return list.stream().flatMapToInt( IntStream::of ).toArray();
    }

    /**
     * Example III
     */
    public static int[] singleNumberIIIFour(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort( nums );

        for (int num : nums) {
            if (list.isEmpty()) {
                list.add( num );
            } else {
                if (list.get( list.size() - 1 ) == num) {
                    list.remove( list.size() - 1 );
                } else {
                    list.add( num );
                }
            }

        }

        return list.stream().mapToInt( i -> i ).toArray();
    }


    /**
     * Example IV
     */
    public static int[] singleNumberIIIFive(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (list.isEmpty()) {
                list.add( num );
            } else {
                if (list.contains( num )) {
                    list.remove( list.indexOf( num ) );
                } else {
                    list.add( num );
                }
            }

        }

        return list.stream().mapToInt( i -> i ).toArray();
    }

    /**
     * Example V
     */
    public static int[] singleNumberIIISix(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains( n ))
                set.remove( n );
            else
                set.add( n );
        }

        int[] output = new int[2];
        int idx = 0;
        for (int num : set)
            output[idx++] = num;
        return output;
    }
}
