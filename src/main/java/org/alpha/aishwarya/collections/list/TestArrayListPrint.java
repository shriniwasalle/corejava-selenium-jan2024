package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListPrint {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add("Aishwarya");
        list1.add(100);
        list1.add("Aish2");
        list1.add(200);
        System.out.println("List1 Array " + list1);
        System.out.println("List size " + list1.size());


        // Printing Values using Index
        // index Calling
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));

        /** ---Index Value Output---
         * Aishwarya
         * 100
         * Aish2
         * 200
         */

        System.out.println("-------Iterate Using for Loop-------");
        for (int i = 0; i <= 3; i++) {
            System.out.println(list1.get(i));
        }
        /**
         * for(int i=0; i<4; i++){
         System.out.println(list1.get(i));}
         *
         * ----Output of For loop----
         * Aishwarya
         * 100
         * Aish2
         * 200
         */

        System.out.println("-------Iterate Using for Each Loop-------");
        for (Object value : list1) // Object=Parent of all Classes,it is used for: if value= different type of data.
        {

            System.out.println(value);
        }
        /** ----Output----
         * -------Iterate Using for Each Loop-------
         * Aishwarya
         * 100
         * Aish2
         * 200
         */
    }


}

