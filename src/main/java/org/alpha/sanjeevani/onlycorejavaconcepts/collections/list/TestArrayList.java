package org.alpha.sanjeevani.onlycorejavaconcepts.collections.list;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        list1.add("sanjeevani");
        list1.add("1994");
        list1.add(30);
        list1.add("sayaji");
        list1.add("1985");
        list1.add(38);
        list1.add("vedant");
        list1.add("2018");
        list1.add(6);
        list1.add("shlok");
        list1.add("2020");
        list1.add(3,"Got Married in 2016");

        System.out.println(list1);
        System.out.println("Size of list1 is:"+list1.size());

        System.out.println("__________________________________________");

        ArrayList list2=new ArrayList();
        list2.addAll(list1);
        System.out.println(list2);
        System.out.println("size of list2 is:"+list2.size());

    }
}
