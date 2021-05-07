package com.codingChallenge.SlowestKey;

public class SlowestKey {

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        char result = keysPressed.charAt(0);
        int index = releaseTimes[0];

        for (int i = 1; i < releaseTimes.length; i++) {
            int temp = releaseTimes[i] - releaseTimes[i - 1];
            if (temp > index) {
                index = temp;
                result = keysPressed.charAt(i);
            } else if (index == temp) {
                if (keysPressed.charAt(i) > result) result = keysPressed.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
