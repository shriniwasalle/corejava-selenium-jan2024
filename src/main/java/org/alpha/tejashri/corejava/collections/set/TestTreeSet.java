package org.alpha.tejashri.corejava.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        // In TreeSet duplicated are not allowed, insertion order does not maintained but Sorting order maintained/preserved
        set.add("D");
        set.add("A");
        set.add("B");
        set.add("C");
        //set.add("B"); // Duplicates are not allowed, will not print
        //set.add(null);//null can add but will give error - Null Pointer Exception
        // bcz it will not compare the null values with other objects

        System.out.println("TreeSet : " + set); //Sorting order maintained/preserved in TreeSet
    }
}
