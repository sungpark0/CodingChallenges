package com.codingChallenge.MinStack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minValue;
    int size;
    public MinStack() {
        stack = new Stack<>();
        minValue = new Stack<>();
        size = 0;
    }

    public void push(int val) {
        stack.push(val);
        size++;
        if (minValue.isEmpty()) {
            minValue.push(val);
        } else {
            if (minValue.peek() >= val) {
                minValue.push(val);
            }
        }
    }

    public void pop() {
        size--;
        int min = stack.pop();
        if (minValue.peek() == min) {
            minValue.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue.peek();
    }

    public static void main(String[] args) {

    }
}
