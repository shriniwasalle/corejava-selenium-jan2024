package org.alpha.tejashri.corejava.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetWithArrayList {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Shri1");
        set.add("Shri3");
        set.add("Shri2");
        set.add("Shri5");
        //set.add("Shri5");//duplicates not allowed in set

        System.out.println("Set : " + set);

        List<String> list = new ArrayList<>();
        System.out.println("Adding set into list");

        list.addAll(set); // adding set into list

        list.add("Shri4");
        list.add("Shri5");// duplicates allowed in list

        System.out.println("List after adding set into it : " + list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(list.size() - 1));

        System.out.println("list : " + list);

        System.out.println("Adding list into set");
        Set<String> set1 = new HashSet<>(list); //adding list into set1, can also add with addAll() method
        set1.add("Shri1"); //duplicates will not print in set1
        set1.add("Shri6");
        set1.add("Shri7");

        //Shri5 is also duplicate in list it will not print in set1
        System.out.println("Set after adding list into it : " + set1);
    }
}
