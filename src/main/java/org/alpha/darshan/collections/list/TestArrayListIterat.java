package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListIterat {


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(100);
        list.add("darshan");
        list.add(200);
        list.add("gaikwad");

        System.out.println("--------for loop----------");

        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------for each loop-----------");

        for(Object o:list){
            System.out.println(o);
        }
    }
}
