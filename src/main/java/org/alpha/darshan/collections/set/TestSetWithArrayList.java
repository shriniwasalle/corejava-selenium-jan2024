package org.alpha.darshan.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestSetWithArrayList {

    public static void main(String[] args) {

        List<String> list2= new ArrayList<>();
        list2.add("darshan");
        list2.add("gaikwad");
        list2.add("priyanka");
        System.out.println("list2"+list2);


        HashSet<String> set= new HashSet<>(list2);
        set.add("darshan");
        set.add("darshan1");
        set.add("darshan2");
        System.out.println("set"+set);

        System.out.println("set:"+set);
        //we can convert set into list and able to add doublicate value.
        List<String> list= new ArrayList<>();
        list.addAll(set);
        list.add("darshan3");
        list.add("darshan2");
        System.out.println("list"+list);
    }
}
