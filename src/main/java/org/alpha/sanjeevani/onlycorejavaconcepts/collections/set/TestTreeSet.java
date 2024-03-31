package org.alpha.sanjeevani.onlycorejavaconcepts.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();// in tree set element print with alphabetic order that means sorting order
        set.add("java4");
        set.add("java2");
        set.add("java1");
        set.add("java3");
        // set.add(null); when we add null but null has no value, that’s why the compareTo() method cannot compare null with another value, giving a NullPointerException.
        //
        //add method declaration


        System.out.println("Treeset is:" + set);
    }
}
