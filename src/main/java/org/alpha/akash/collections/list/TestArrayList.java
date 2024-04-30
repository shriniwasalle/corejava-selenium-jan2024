package org.alpha.akash.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add(100);
        list1.add(200);
        list1.add("Akash");
        list1.add('A');
        list1.add(100.5f);
        list1.add(100.5);
        list1.add(null);
        list1.add(null);
        list1.add("");
        //list1.add(); // can not write this type

        System.out.println(list1);
        list1.add(2,"xyz");
        System.out.println(list1);
        list1.set(2,"Akki");
        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add("Akki2");
        System.out.println(list2);

    }
}

