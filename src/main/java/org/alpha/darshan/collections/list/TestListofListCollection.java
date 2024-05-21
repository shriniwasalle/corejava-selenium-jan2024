package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListofListCollection {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList();
        list1.add("darshan1");
        list1.add("darshan2");
        list1.add("darshan3");


        List<String> list2 = new ArrayList();
        list2.add("darshan4");
        list2.add("darshan5");
        list2.add("darshan6");

        List<String> list3= new ArrayList<>();
        list3.add("darshan7");
        list3.add("darshan8");
        list3.add("darshan9");

        List<List<String>> list= new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);

        System.out.println(list);

        for(List<String> l:list){
            for (String l1:l){
                System.out.println(l1);
            }
        }
    }

}
