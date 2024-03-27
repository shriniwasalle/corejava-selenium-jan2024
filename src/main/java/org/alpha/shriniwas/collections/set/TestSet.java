package org.alpha.shriniwas.collections.set;

import java.util.HashSet;

public class TestSet {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Shriniwas");
        set.add(100);
        set.add(100); // false
        set.add(true);
        set.add(true);
        set.add(100.50);
        set.add(null);
        set.add(null);

        System.out.println(set);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
