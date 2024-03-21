package org.alpha.shriniwas.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetWithArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shri4");
        list.add("Shri5");
        list.add("Shri5");

        System.out.println("List: " +list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(list.size()-1));

        Set<String> set = new HashSet<>(list);
        set.add("Shri1");
        set.add("Shri3");
        set.add("Shri2");
        set.add("Shri5");
        System.out.println("Set: " +set);
    }
}
