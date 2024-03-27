package org.alpha.darshan.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestMapWithList {

    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();
        list1.add("darshan1");
        list1.add("darshan2");
        list1.add("darshan3");
        list1.add("darshan4");

        List<String> list2= new ArrayList<>();
        list2.add("darshan5");
        list2.add("darshan6");
        list2.add("darshan7");



        HashMap<Integer, List<String>> map= new HashMap<>();
        map.put(101,list1);
        map.put(102,list2);

        System.out.println(map);

    }
}
