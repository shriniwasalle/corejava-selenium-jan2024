package org.alpha.shriniwas.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfList {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Shri1");
        list1.add("Shri2");
        list1.add("Shri3");

        // List<String> list1 = new ArrayList<>(list); // ArrayList(Collection c)

        // System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Shri4");
        list2.add("Shri5");
        list2.add("Shri6");

        List<String> list3 = new ArrayList<>();
        list3.add("Shri7");
        list3.add("Shri8");
        list3.add("Shri9");

        List<List<String>> li = new ArrayList<>();
        li.add(list1);
        li.add(list2);
        li.add(list3);

        // [Shri1, Shri2, Shri3]
        // [List1=(Shri1, Shri2, Shri3), List2=(Shri4, Shri5, Shri6)]

        System.out.println(li);

        for (List<String> liStr : li) {
            for (String str : liStr) {
                System.out.println(str);
            }
        }
    }
}
