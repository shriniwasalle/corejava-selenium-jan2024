package org.alpha.akash.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrint {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(100);// index: 0
        list1.add("Akash");// index: 1
        list1.add(200);// index: 2
        list1.add("Akki");// index: 3
        list1.add(300);// index: 4
        list1.add("Pawan");// index: 5

        System.out.println("List1 :" +list1);
        System.out.println("List1 Size:" +list1.size());
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));
        System.out.println(list1.get(4));
        System.out.println(list1.get(5));

        System.out.println("----------Iterate  using For Loop-------");

        for (int i = 0; i <= list1.size()-1 ; i++) {
            System.out.println(list1.get(i));

        }

        System.out.println("----------Iterate using For Each Loop-------");

        for (Object value : list1) {
            System.out.println(value);
        }
    }
}
