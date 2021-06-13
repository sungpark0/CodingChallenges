package com.codingChallenge.RobotBoundedInCircle;

public class RobotBoundedInCircle {
    public static boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;

        char direction = 'N';

        for (char ch : instructions.toCharArray()) {
            if (ch == 'G') {
                if (direction == 'N') y++;
                else if (direction == 'W') x--;
                else if (direction == 'S') y--;
                else x++;
            } else if (ch == 'L') {
                if (direction == 'N') direction = 'W';
                else if (direction == 'W') direction = 'S';
                else if (direction == 'S') direction = 'E';
                else direction = 'N';
            } else {
                if (direction == 'N') direction = 'E';
                else if (direction == 'W') direction = 'N';
                else if (direction == 'S') direction = 'W';
                else direction = 'S';
            }
        }

        return (x == 0 && y == 0) || direction != 'N';
    }

    public static void main(String[] args) {

    }
}
