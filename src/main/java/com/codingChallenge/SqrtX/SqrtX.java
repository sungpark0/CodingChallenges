package com.codingChallenge.SqrtX;

public class SqrtX {

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x < 4) return 1;

        int left = 0;
        int right = x;
        int sqrt = 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (mid > x / mid) {
                right = mid - 1;
            } else {
                sqrt = mid;
                left = mid + 1;
            }
        }

        return sqrt;
    }

    public static void main(String[] args) {

    }
}
