package org.alpha.sanjeevani.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shlok1");
        list.add("Shlok2");
        list.add("Shlok3");
        list.add("Shlok4");

        System.out.println(list);
        ListIterator<String> itr = list.listIterator(list.size());// ListIterator is allowed for list,interfaces and classes
     /*   itr.next();
        itr.next();
        itr.next();
     */
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

    }
}

