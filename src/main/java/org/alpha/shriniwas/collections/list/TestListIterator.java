package org.alpha.shriniwas.collections.list;

import java.util.*;

public class TestListIterator {

    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("Shri1");
        obj.add("Shri2");
        obj.add("Shri3");
        obj.add("Shri4");

        // list = [Shri1, Shri2, Shri3]

        // ListIterator<String> itr = obj.listIterator(); // listIterator is allowed only for List interface classes
        ListIterator<String> itr = obj.listIterator(obj.size());

//        itr.next();
//        itr.next();
//        itr.next();

        // itr = [Shri1, Shri2, Shri3]
        while (itr.hasPrevious()) {
            System.out.println(itr.previous()); // Shri1
        }
    }
}
