package org.alpha.shriniwas.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(100);
        list1.add(200);
        list1.add("Shriniwas");
        list1.add('A');
        list1.add(15.5f);
        list1.add(15.6);
        list1.add(100);
        list1.add(null);
        list1.add(null);

        System.out.println("List1:" + list1);

        list1.add(2, "Akash");
        list1.set(2, "Darshan");
        System.out.println("After Set List:" + list1);

        List list2 = new ArrayList();
        list2.add("Shriniwas");
        System.out.println("List2 : " +list2);
    }
}
