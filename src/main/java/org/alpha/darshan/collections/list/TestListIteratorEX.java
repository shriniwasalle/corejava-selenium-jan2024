package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIteratorEX {

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();

        list.add("darshan");
        list.add("darshan2");
        list.add("darshan3");

       ListIterator<String> liS= list.listIterator(list.size());

       while (liS.hasPrevious()){
           System.out.println(liS.previous());
       }
    }
}
