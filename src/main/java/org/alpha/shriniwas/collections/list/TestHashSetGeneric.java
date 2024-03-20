package org.alpha.shriniwas.collections.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSetGeneric {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Shri1");
        set.add("Shri2");
        set.add("Shri3");

        Iterator<String> itr = set.iterator();

        for (String str : set) {
            System.out.println(str);
        }
    }
}
