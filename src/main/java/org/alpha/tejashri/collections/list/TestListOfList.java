package org.alpha.tejashri.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Shri1");
        list1.add("Shri2");
        list1.add("Shri3");

        List<String> list = new ArrayList<>(list1); // ArrayList(Collection e) passed parameter
        System.out.println(list1);
        // list =[Shri1, Shri2, Shri3]

        List<String> list2 = new ArrayList<>();
        list2.add("Shri4");
        list2.add("Shri5");
        list2.add("Shri6");

        List<String> list3 = new ArrayList<>();
        list3.add("Shri7");
        list3.add("Shri8");
        list3.add("Shri9");

        List<List<String>> lists = new ArrayList<>(); //List of list // Multi Dimensional collection
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        System.out.println(lists);
        // Multi Dimensional collection
        //lists = [list1 = [Shri1, Shri2, Shri3], list2 = [Shri1, Shri2, Shri3], list3 =[Shri7, Shri8, Shri9]]

        for (List<String> liStr : lists) {   // Multi Dimensional collection iteration
            for (String str : liStr) {
                System.out.println(str);
            }
        }


    }
}
