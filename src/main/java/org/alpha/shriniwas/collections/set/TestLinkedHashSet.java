package org.alpha.shriniwas.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Shri1");
        set.add("Shri3");
        set.add("Shri2");
        set.add("Shri5");
        set.add("Shri5");
        set.add(null);

        System.out.println(set);
    }
}
