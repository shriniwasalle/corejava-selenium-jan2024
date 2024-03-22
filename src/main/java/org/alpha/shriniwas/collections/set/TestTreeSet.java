package org.alpha.shriniwas.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("Z");
        set.add("C");
        set.add("B");
        set.add("D");
        set.add(null);

        System.out.println(set);
    }
}
