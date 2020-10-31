package com.rootbyos.springboot.SingleNumber;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {

        int[] x = {4, 1, 2, 1, 2};
        int[] y = {2, 2, 1};
//        System.out.println( singleNumber( x ) + " " + " 4 " );
//        System.out.println( singleNumber( y ) + " " + " 1 " );

//        System.out.println( singleNumberON( x ) + " : " + " 4 " );
        System.out.println( singleNumberSecondWeek( x ) );


    }

    public static int singleNumberSecondWeek(int[] nums) {

        Arrays.sort( nums );
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }


    public static int singleNumberNoExtraMemory(int[] nums) {
        if (nums.length == 1) return nums[0];

        Arrays.sort( nums );

//        [1,1,2,2,4]
//        [2,2,5,7,7,8,8]


        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    //Time Complexity: O(N^2)
    //Space Complexity: O(1)
    public static int singleNumber(int[] nums) {
        int answer = 0;
        int counter = 0;

        if (nums.length == 1) {
            return nums[0];
        }


        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) { // 1    2    2    4   < i = 0 , i < nums.length, i++>
//                         nums =    num  num  num  num
                if (nums[i] == num) {
                    counter++;
                }
                if (counter == 2) {
                    i++;
                    break;
                }
            }

            if (counter == 1) {
                answer = nums[i];
                break;
            }
            counter = 0;
        }

        return answer;
    }

}
