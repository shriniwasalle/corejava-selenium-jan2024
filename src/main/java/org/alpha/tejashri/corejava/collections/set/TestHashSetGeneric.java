package org.alpha.tejashri.corejava.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetGeneric {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        // In HashSet duplicated are not allowed, insertion order does not maintain/preserve
        //Set<String> set = new HashSet<>(); // also possible bcz Set is the parent class for HashSet

        //Generic String type values are added in HashSet
        set.add("Shri1");
        set.add("Shri2");
        set.add("Shri3");
        set.add("Shri4");
        System.out.println(set);//insertion order is not preserved/maintained

        System.out.println("----Iteration Using for each loop----");
        for (String str : set) {
            System.out.println(str);
        }

        //Get Iterator of String type
        Iterator<String> itr = set.iterator();
        System.out.println("----Iteration Using while loop----");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}