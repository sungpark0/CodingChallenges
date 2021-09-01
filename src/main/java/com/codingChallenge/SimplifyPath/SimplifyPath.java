package com.codingChallenge.SimplifyPath;

import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        String[] pathStr = path.split("/");
        Deque<String> deque = new ArrayDeque<>();

        for (String str : pathStr) {
            if (!deque.isEmpty() && str.equals("..")) {
                deque.pop();
            } else if (!str.equals("..") && !str.equals(".") && !str.equals("")) {
                deque.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            sb.append("/").append(deque.pollLast());
        }

        return sb.length() > 0 ? sb.toString() : "/";

    }

    public static void main(String[] args) {

    }
}
