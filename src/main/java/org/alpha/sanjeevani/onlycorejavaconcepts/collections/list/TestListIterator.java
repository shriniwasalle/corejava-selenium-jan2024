package org.alpha.sanjeevani.onlycorejavaconcepts.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shlok1");
        list.add("Shlok2");
        list.add("Shlok3");
        list.add("Shlok4");
        System.out.println(list);

        ListIterator<String> itr = list.listIterator();// ListIterator is allowed for list,interfaces and classes
        while (itr.hasNext()) {
            System.out.println(itr.next());


        }

    }
}
