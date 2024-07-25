package org.alpha.sanjeevani.onlycorejavaconcepts.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("java4");
        set.add("java1");
        set.add("java2");
        set.add("java3");

        System.out.println("set is:"+set);

    }
}
