package org.alpha.shriniwas.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");

        System.out.println(list);

        // list = [Shri1, Shri2, Shri3]

        Iterator<String> itr = list.iterator(); // iterator is allowed for List, Set, Queue

        // itr = [Shri1, Shri2, Shri3]
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Shri1, Shri2, Shri3
        }
    }
}
