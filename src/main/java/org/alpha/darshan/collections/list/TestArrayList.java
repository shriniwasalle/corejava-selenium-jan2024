package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {


    public static void main(String[] args) {
         ArrayList list= new ArrayList();
        list.add("darsan");
        list.add(100);
        list.add(200);
        list.add("darshan");
        list.add("gaikwad");

        list.add(0,"Drshan");
        ArrayList l2= new ArrayList();
        l2.add(50);
        l2.addAll(list);
        l2.add(1000);
        l2.set(1,"D");
        System.out.println(l2);
        System.out.println("list size:"+l2.size());
    }
}
