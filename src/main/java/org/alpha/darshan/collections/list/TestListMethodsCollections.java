package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListMethodsCollections {

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();

        list.add("darshan1");
        list.add("darshan2");
        list.add("darshan3");

        list.add(0,"darshan");

        System.out.println(list);
        list.set(0,"darshan1");
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains("darshan1"));
        System.out.println(list.indexOf("darshan3"));
    }
}
