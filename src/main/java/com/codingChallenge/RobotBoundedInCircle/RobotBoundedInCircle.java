package com.codingChallenge.RobotBoundedInCircle;

public class RobotBoundedInCircle {
    public static boolean isRobotBounded(String instructions) {
        int[][] paths = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[] origin = new int[]{0, 0};
        int direction = 0;

        for (char ch : instructions.toCharArray()) {
            if (ch == 'G') {
                origin[0] += paths[direction][0];
                origin[1] += paths[direction][1];
            } else if (ch == 'L') direction = (direction + 3) % 4;
            else if (ch == 'R') direction = (direction + 1) % 4;
        }

        return ((origin[0] == 0 && origin[1] == 0) || direction != 0);
    }

    public static void main(String[] args) {

    }
}
