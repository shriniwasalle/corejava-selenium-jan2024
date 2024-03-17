package org.alpha.tejashri.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");
        System.out.println(list);//list = [Shri1, Shri2, Shri3]

        //Iterator is a Cursor concept

        Iterator<String> itr = list.iterator();//itr = [Shri1, Shri2, Shri3]

        System.out.println("----Using while loop----");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("----Using for each loop----");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
