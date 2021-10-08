package com.codingChallenge.Tree;

public class SumOfNodesWithEvenValuedGrandparent extends BinarySearchTree {

    static int sum = 0;

    public static int sumEvenGrandparent(TreeNode root) {

        dfs(root, root.left);
        dfs(root, root.right);

        return sum;
    }

    public static void dfs(TreeNode root, TreeNode parent) {
        if (root == null || parent == null) return;

        if (root.val % 2 == 0) {
            sum += parent.left != null ? parent.left.val : 0;
            sum += parent.right != null ? parent.right.val : 0;
        }

        dfs(parent, parent.left);
        dfs(parent, parent.right);
    }

    public static void main(String[] args) {

    }
}

//        import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//
//public class Solution {
//    public static void main(String args[] ) throws Exception {
//        //Reading input
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        System.out.println(helper(input));
//    }
//
//    public static String helper(String str) {
//        String[] formatChecker = str.split(" ");
//
//        boolean E1 = false;
//        boolean E2 = false;
//        boolean E3 = false;
//        boolean E5 = false;
//
//        //Invalid Input Format
//        if (str.charAt(0) == ' ' || str.charAt(str.length() - 1) == ' ') {
//            E1 = true;
//        } else {
//            for (int i = 0; i < str.length() - 1; i++) {
//                if (str.charAt(i) == ')' && str.charAt(i + 1) != ' ') {
//                    E1 = true;
//                    break;
//                }
//            }
//
//            if (!E1) {
//                for (int i = 0; i < formatChecker.length; i++) {
//                    char[] charArr = formatChecker[i].toCharArray();
//                    if (charArr.length != 5 || charArr[0] != '(' || charArr[4] != ')' || charArr[2] != ','||
//                            !Character.isUpperCase(charArr[1]) || !Character.isUpperCase(charArr[3])
//                    ) {
//                        E1 = true;
//                        break;
//                    }
//                }
//            }
//        }
//
//        if (E1) return "E1";
//
//        //Duplicate Pair
//        Set<String> set = new HashSet<>();
//
//        for (String s : formatChecker) {
//            if (set.contains(s)) {
//                E2 = true;
//                break;
//            }
//            set.add(s);
//        }
//
//        if (E2) return "E2";
//
//        //Parent has more than two children
//        Map<Character, String> map = new HashMap<>();
//
//        for (int i = 0; i < formatChecker.length; i++) {
//            char[] charArr = formatChecker[i].toCharArray();
//
//            String temp = map.get(charArr[1]) == null ? "" : map.get(charArr[1]);
//
//            map.put(charArr[1], temp + charArr[3]);
//
//            if (map.get(charArr[1]).length() > 2) {
//                E3 = true;
//                break;
//            }
//        }
//
//        if (E3) return "E3";
//
//        //Multiple roots
//        int counter = 0;
//        Character ch = ' ';
//        boolean[][] checker = new boolean[26][26];
//        Set<Character> chars = new HashSet<>();
//
//        for (int i = 0; i < formatChecker.length; i++) {
//            char[] charArr = formatChecker[i].toCharArray();
//            chars.add(charArr[1]);
//            chars.add(charArr[3]);
//
//            int parent = charArr[1] - 'A';
//            int child = charArr[3] - 'A';
//
//            checker[parent][child] = true;
//        }
//
//        for (char c : chars) {
//            for (int i = 0; i < 26; i++) {
//                if (checker[i][c - 'A']) {
//                    break;
//                }
//
//                if (i == 25) {
//                    ch = c;
//                    counter++;
//                    boolean[] visited = new boolean[26];
//                    if (checkCycle(c, checker, visited)) E5 = true;
//                }
//            }
//        }
//
//        if (counter > 1) return "E4";
//
//        //Input contains cycle
//        if (E5 || counter == 0) return "E5";
//
//
//        return dfsBuildString(ch, checker);
//    }
//
//    public static String dfsBuildString(Character ch, boolean[][] checker) {
//        String firstChild = "";
//        String secondChild = "";
//
//        for (int i = 0; i < 26; i++) {
//            if (checker[ch - 'A'][i]) {
//                firstChild = dfsBuildString((char) (i + 'A'), checker);
//
//                for (int j = i + 1; j < 26; j++) {
//                    if (checker[ch - 'A'][j]) {
//                        secondChild = dfsBuildString((char) (j + 'A'), checker);
//                        break;
//                    }
//                }
//                break;
//            }
//        }
//
//        return "(" + ch + firstChild + secondChild + ")";
//    }
//
//    public static boolean checkCycle(Character ch, boolean[][] checker, boolean[] visited) {
//        if (visited[ch - 'A']) return true;
//
//        visited[ch - 'A'] = true;
//
//        for (int i = 0; i < 26; i++) {
//            if (checker[ch - 'A'][i]) {
//                if (checkCycle((char) (i + 'A'), checker, visited)) return true;
//            }
//        }
//
//        return false;
//    }
//}
