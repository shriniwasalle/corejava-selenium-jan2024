package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add(" "); // for space
        list1.add(100);
        list1.add(200);
        list1.add("Aishwarya");
        list1.add('A');
        list1.add(15.5f);
        list1.add(10.3);
        list1.add(null);
        list1.add(null);

        list1.add(3, "Sagar"); // size added and Updated index number 3 & old inder shifted to next index i.e 4
        // int[] arr ={100,200,300,400}; we also call Array in ArrayList

        ArrayList list2 = new ArrayList();
        list2.addAll(list1);

        System.out.println("List Size: " + list1);

        System.out.println(list1.size());


    }

}
/**
 * --OutPut--
 * List Size: [ , 100, 200, Sagar, Aishwarya, A, 15.5, 10.3, null, null]
 * 10
 */