package org.alpha.darshan.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        Set<String> list = new LinkedHashSet<>();
        list.add("darshan");
        list.add("darshan1");
        list.add("darshan2");
        list.add("darshan5");
        list.add("darshan4");
        list.add("darshan7");
        System.out.println(list);
    }
}