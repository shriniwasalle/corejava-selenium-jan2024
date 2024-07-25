package org.alpha.sanjeevani.onlycorejavaconcepts.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shlok1");
        list.add("Shlok2");
        list.add("Shlok3");
        list.add("Shlok4");
        System.out.println(list);

        Iterator<String> itr = list.iterator();// Iterator is allowed for list,set,queue,map interfaces and classes
      //itr=[Shlok1, Shlok2, Shlok3, Shlok4]

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
