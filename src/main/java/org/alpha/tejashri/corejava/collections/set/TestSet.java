package org.alpha.tejashri.corejava.collections.set;

import java.util.HashSet;

public class TestSet {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        //Non-generic values are added in set
        set.add("Tejashri");
        set.add(1000);
        set.add(true);
        set.add(99.9f);
        set.add('H');
        set.add(null);
        set.add(1000); // false so duplicate values will not print
        set.add("Tejashri");// false //duplicate values are not allowed
        set.add(null);// can add only 1 null value bcz duplicate values not allowed

        System.out.println(set); //insertion order is not preserved/maintained

        // iteration with for loop is not possible bcz insertion order is not maintained,
        // with index iteration not possible, so get() method not there
        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}
