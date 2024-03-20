package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListofList1 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(); // list parent of ArrayList
        list1.add("Aishwarya1");
        list1.add("Aishwarya2");
        list1.add("Aishwarya3");


        List<String> list2 = new ArrayList<>(); // list parent of ArrayList
        list2.add("Aishwarya6");
        list2.add("Aishwarya5");
        list2.add("Aishwarya4");

        // Calling 1 List into another list

        List<List<String>> li = new ArrayList<>();
        li.add(list1);
        li.add(list2);
        System.out.println(li); // output: [[Aishwarya1, Aishwarya2, Aishwarya3], [Aishwarya6, Aishwarya5, Aishwarya4]]

        // Iterate using separate Bracket
        for (List<String> liStr : li) {
            System.out.println(liStr); // OutPut : [Aishwarya1, Aishwarya2, Aishwarya3]
            //[Aishwarya6, Aishwarya5, Aishwarya4]
        }

        // Iterate using Separate String
        for (List<String> liStr : li) {
            for (String str : liStr) {

                System.out.println(str);
            }
        }

    }
}


/**
 * ----OutPut----
 * [[Aishwarya1, Aishwarya2, Aishwarya3], [Aishwarya6, Aishwarya5, Aishwarya4]]
 * [Aishwarya1, Aishwarya2, Aishwarya3]
 * [Aishwarya6, Aishwarya5, Aishwarya4]
 * Aishwarya1
 * Aishwarya2
 * Aishwarya3
 * Aishwarya6
 * Aishwarya5
 * Aishwarya4
 */