package org.alpha.sanjeevani.onlycorejavaconcepts.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Raje1");
        list1.add("Raje2");
        list1.add("Raje3");

        // List<String>list=new ArrayList<>(list1);Arraylist(collection c)
        //System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("Raje4");
        list2.add("Raje5");
        list2.add("Raje6");

        List<String> list3 = new ArrayList<>();
        list3.add("Raje7");
        list3.add("Raje8");
        list3.add("Raje9");

        List<List<String>> li = new ArrayList<>();
        li.add(list1);
        li.add(list2);
        li.add(list3);
        System.out.println(li);


        for (List<String> listr : li) {

            for (String str : listr) {

                System.out.println(str);

            }
        }

    }
}
