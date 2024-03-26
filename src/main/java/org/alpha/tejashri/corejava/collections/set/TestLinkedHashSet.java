package org.alpha.tejashri.corejava.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        // In LinkedHashSet duplicated are not allowed but insertion order maintained/preserved
        set.add("Shri1");
        set.add("Shri2");
        set.add("Shri3");
        set.add("Shri4");
        set.add(null);//
        //set.add("Shri4"); // Duplicates are not allowed, will not print

        System.out.println("LinkedHashSet : " + set); //Insertion order maintained/preserved in LinkedHashSet
    }
}
