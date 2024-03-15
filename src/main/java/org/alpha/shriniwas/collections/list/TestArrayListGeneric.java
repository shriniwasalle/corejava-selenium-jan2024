package org.alpha.shriniwas.collections.list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TestArrayListGeneric {

    // Wrapper Classes

    // int -> Integer
    // long -> Long
    // boolean -> Boolean
    // short -> Short
    // char -> Character
    // double -> Double
    // float -> Float

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");

        System.out.println("--- For Each Loop ---");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("--- For Loop ---");
        for (int i = 0; i <= list.size() - 1 ; i++) {
            System.out.println(list.get(i));
        }

        List<Integer> list1 = new ArrayList();
        list1.add(100);
        list1.add(200);
        list1.add(300);

        System.out.println("Integer List: " + list1);

        System.out.println("--- For Each Loop ---");
        for (Integer i : list1) {
            System.out.println(i);
        }

        System.out.println("--- For Loop ---");
        for (int i = 0; i <= list1.size() - 1 ; i++) {
            System.out.println(list1.get(i));
        }

        Employee emp1 = new Employee("Shri1", 100);
        Employee emp2 = new Employee("Shri2", 200);
        Employee emp3 = new Employee("Shri3", 300);

        List<Employee> empList = new ArrayList();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        for (Employee emp : empList) {
            Employee e= emp;
            System.out.println(e.empName);
            System.out.println(e.empId);
        }
    }
}
