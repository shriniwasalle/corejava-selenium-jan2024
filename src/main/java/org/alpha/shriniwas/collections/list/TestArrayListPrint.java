package org.alpha.shriniwas.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListPrint {

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("Shri1"); // 0
        list1.add(200); // 1
        list1.add("Shri2"); // 2
        list1.add(100); // 3
        list1.add(15.5f);

        System.out.println("List1: " + list1);
        System.out.println("List1 Size: " +list1.size()); // 4
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));

        System.out.println("--- Iterate Using For Loop ---");

        for (int i = 0; i <= list1.size() - 1; i++) {
            System.out.println(list1.get(i)); // list1.get(0), list1.get(1), list1.get(2), list1.get(3)
        }

        System.out.println("--- Iterate Using For Each Loop ---");
        // list1 = [Shri1, 200, Shri2, 100]
        for (Object value : list1) {
            System.out.println(value);
        }
    }
}
