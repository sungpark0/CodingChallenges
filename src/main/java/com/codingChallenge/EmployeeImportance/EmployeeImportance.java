package com.codingChallenge.EmployeeImportance;

import java.util.*;

public class EmployeeImportance {

    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public static int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        int total = 0;

        for (Employee emp : employees) {
            map.put(emp.id, emp);
        }

        Queue<Employee> queue = new LinkedList<>();
        queue.add(map.get(id));

        while (!queue.isEmpty()) {
            Employee val = queue.remove();

            for (int idNum : val.subordinates) {
                queue.add(map.get(idNum));
            }

            total += val.importance;
        }

        return total;
    }

    public static void main(String[] args) {

    }
}
