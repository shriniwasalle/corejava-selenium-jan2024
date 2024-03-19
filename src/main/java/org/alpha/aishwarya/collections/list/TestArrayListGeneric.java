package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListGeneric {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("Aish1");
        list.add("Aish2");

        System.out.println("----For Each Loop---");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("---For Loop----");
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---Using Wrapper Class---");
        List<Integer> list1 = new ArrayList();
        list1.add(100); // if we call list.add(100) then it consider the above string list.
        list1.add(200);
        System.out.println("Integer list " + list1);


        System.out.println("----For Loop----");
        for (int i = 0; i <= list1.size() - 1; i++) {
            System.out.println(list1.get(i));

        }

        System.out.println("----Employee List----");
        // Employee emp1 = new Employee("Aishwarya",100);


    }

}
/**
 * -----Output-----
 * ----For Each Loop---
 * Aish1
 * Aish2
 * ---For Loop----
 * Aish1
 * Aish2
 */

