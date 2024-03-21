package org.alpha.sanjeevani.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetWithArrayList {
      public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        //list.addAll(set);
        list.add("java3");
        list.add("java5");
        list.add("java5");

        System.out.println("List is :"+list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(list.size()-1));


        Set<String>set=new HashSet<>(list);
        set.add("java1");
        set.add("java2");
        set.add("java3");
        set.add("java4");
        set.addAll(list);
        System.out.println("set is:"+set);


      }
}
