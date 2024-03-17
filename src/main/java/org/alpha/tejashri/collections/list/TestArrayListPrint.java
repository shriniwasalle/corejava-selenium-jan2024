package org.alpha.tejashri.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListPrint {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("Mahi");//0
        list1.add(100);//1
        list1.add("Anshu");//2
        list1.add(200);//3

        System.out.println("list1 : " + list1);
        System.out.println("size of list1 ; " + list1.size());

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));

        System.out.println("-----Iterate Using For Loop-----");
        for (int i = 0; i <= list1.size() - 1; i++) { //or write i<list1.size()
            System.out.println(list1.get(i)); // order Mahi 100 Anshu 200
        }

        System.out.println("-----Iterate in revers order using For Loop-----");
        for (int i = list1.size() - 1; i >= 0; i--) { //or write i<list1.size()
            System.out.println(list1.get(i)); // 200 Anshu 100 Mahi in revers order
        }

        System.out.println("-----Iterate Using For Each Loop-----");
        for (Object obj : list1){ // object class is the parent class for all primitive data type
            System.out.println(obj);
        }
    }
}