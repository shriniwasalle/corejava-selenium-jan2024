package org.alpha.sanjeevani.onlycorejavaconcepts.collections.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestHashSet2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("chikoo");

        Iterator<String> itr = hashSet.iterator();

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println("element of HahMap is :" + element);
        }

    }
}

