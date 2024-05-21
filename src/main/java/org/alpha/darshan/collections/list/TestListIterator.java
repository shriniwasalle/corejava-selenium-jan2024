package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListIterator {

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("darshan1");
        list.add("darshan2");
        list.add("darshan3");

        Iterator<String> itr= list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());


        }
    }
}
