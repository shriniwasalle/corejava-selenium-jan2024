package org.alpha.sanjeevani.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListPrint {
    public static void main(String[] args) {
        List list1=new ArrayList();

        list1.add("corejava");// index 0
        list1.add("selenium");// index 1
        list1.add("Automation");// index 2
        list1.add("testNG");// index 3
        System.out.println(list1);

        System.out.println("------------------------for single element printing use get()--------------------");
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));

        System.out.println("------------------------Iterate using for loop--------------------");
        for(int i=0;i<=list1.size()-1;i++) {
            System.out.println(list1.get(i));
        }

            System.out.println("------------------------Iterate using for each loop--------------------");

            for (Object value :list1){
                System.out.println(value);
        }
    }
}
