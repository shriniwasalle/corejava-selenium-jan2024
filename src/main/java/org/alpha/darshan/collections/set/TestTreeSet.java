package org.alpha.darshan.collections.set;

import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        TreeSet<String> set= new TreeSet<>();
        set.add("darshan");
        set.add("darshan5");
        set.add("darshan4");
        set.add("darshan2");
        set.add("darshan3");
       // set.add(null);

        //null is throwing exception bcz treeset is sorted and compare the values

        System.out.println(set);
    }
}
