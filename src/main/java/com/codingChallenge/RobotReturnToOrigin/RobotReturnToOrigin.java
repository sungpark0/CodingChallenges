package com.codingChallenge.RobotReturnToOrigin;

public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'R') y++;
            else if (ch == 'L') y--;
            else if (ch == 'U') x++;
            else x--;
        }

        return x == 0 && y == 0;
    }

    public static boolean judgeCircleII(String moves) {
        int[] origin = new int[] {0, 0};

        for (char ch : moves.toCharArray()) {
            if (ch == 'U') origin[0]++;
            else if (ch == 'D') origin[0]--;
            else if (ch == 'R') origin[1]++;
            else origin[1]--;
        }

        return origin[0] == 0 && origin[1] == 0;
    }

    public static void main(String[] args) {

    }
}
