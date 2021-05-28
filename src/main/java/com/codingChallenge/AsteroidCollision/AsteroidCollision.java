package com.codingChallenge.AsteroidCollision;

import java.util.*;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int asteroid : asteroids){
            if(asteroid > 0) {
                stack.push(asteroid);
            } else if (asteroid < 0) {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(asteroid);
                }
                if(stack.peek() == Math.abs(asteroid)) {
                    stack.pop();
                }
            }
        }

        int[] result = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0; i--){
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
