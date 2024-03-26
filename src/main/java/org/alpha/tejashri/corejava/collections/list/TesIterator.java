package org.alpha.tejashri.corejava.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");
        System.out.println(list);//list = [Shri1, Shri2, Shri3]

        /* Iterator is a Cursor concept
         * Iterator is allowed for List, Set, Queue, Map interface classes
         * Iterator-> is interface, iterator()-> is method  */

        Iterator<String> itr1 = list.iterator();//itr = [Shri1, Shri2, Shri3]
        System.out.println(itr1.next());//Shri1- at start the cursor(|) is before |Shri1
        System.out.println(itr1.next());//Shri2
        System.out.println(itr1.hasNext());//true -bcz after Shri2 the has next value yes, value is present so true

        System.out.println(itr1.hashCode());//will give the hash code

        System.out.println(itr1.next());//Shri3
        System.out.println(itr1.hasNext());//false -bcz after Shri3 the next value is not present

        // Get the Iterator of type String
        Iterator<String> itr = list.iterator();//itr = [Shri1, Shri2, Shri3]

        System.out.println("----Using while loop----");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("----Using for each loop----");
        for (String s : list) {
            System.out.println(s);
        }

        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(2);
        list1.add(100);
        list1.add(110);
        list1.add(200);
        list1.add(350);
        list1.add(60);
        list1.add(28);
        list1.add(99);
        System.out.println(list1);

        //Removing Items from a Collection
        //list1.removeIf(i -> i > 100 || (i < 50));
        //System.out.println("Print values > 100 : " +list1);

        //Can also Removing Items from a Collection with the help of while loop
        // Get the Iterator of type Integer
        Iterator<Integer> itrInt = list1.iterator();
        while (itrInt.hasNext()) {
            Integer i = itrInt.next();
            if (i > 100 || i < 50) {
                itrInt.remove();
            }
        }
        System.out.println("Print values > 100 : " + list1);
        //Trying to remove items using a for loop or a for-each loop
        // would not work correctly because the collection is changing size
        // at the same time that the code is trying to loop
    }
}
