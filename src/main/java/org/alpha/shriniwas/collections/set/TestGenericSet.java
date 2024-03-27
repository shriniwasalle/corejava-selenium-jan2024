package org.alpha.shriniwas.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestGenericSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("Shriniwas");
        set.add("Anjali");
        set.add("Rohit");
        set.add("Kasturi");
        // set.add(100);

        System.out.println(set);

        for (String str : set) {
            System.out.println(str);
        }

       Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
