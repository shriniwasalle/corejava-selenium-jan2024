package org.alpha.tejashri.corejava.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        System.out.println("----list (String)----");
        List<String> list = new ArrayList<>();

        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");
        System.out.println(list);//list = [Shri1, Shri2, Shri3]

        /* listIterator is a Cursor concept
         * listIterator is allowed for only List interface classes
         * ListIterator-> is interface, listIterator()-> is method  */

        //ListIterator<String> itr1 = list.listIterator();//itr = [Shri1, Shri2, Shri3]
        //itr1.next();
        //itr1.next();
        //itr1.next(); //Now cursor(|) is at Shri3| (after Shri3)

        // Or use listIterator(int index) method pass the index value from where to iterate
        //ListIterator<String> itr1 = list.listIterator(2);//will start the iteration from Shri2
        // To make it dynamic use index value as a list.size()

        ListIterator<String> itr1 = list.listIterator(list.size());

        //Now iteration start from index 3 (list.size()=3) means from Shri3| (after Shri3)
        //Now we can iterate the list in Backward/Reverse Order
        System.out.println("----Iteration in Backward/Reverse Order Using while loop----");
        while (itr1.hasPrevious()) {
            System.out.println(itr1.previous());
        }

        //Now cursor(|) is at |Shri1 (before Shri1)
        //Now we can iterate the list in Forward/Natural Order
        System.out.println("----Iteration in Forward/Natural Order Using while loop----");
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        //Now cursor(|) is at Shri3| (after Shri3)
        System.out.println(itr1.hasPrevious());// true -bcz before Shri3 the has previous value yes, value is present so true
        System.out.println(itr1.previous());// Shri3
        System.out.println(itr1.previous());// Shri2
        System.out.println(itr1.previous());// Shri1
        System.out.println(itr1.hasPrevious());//false -bcz before Shri1 the Previous value is not present
        //Now cursor(|) is at |Shri1 (before Shri1)
        System.out.println(itr1.hasNext()); //true

        System.out.println("----list1 (Integer)----");
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

        //Removing Items from a Collection using removeIf() method
        //list1.removeIf(i -> i > 100 || (i < 50));
        //System.out.println("Print values after removing : " +list1);

        //Can also Removing Items from a Collection with the help of while loop
        // Get the Iterator of type Integer
        ListIterator<Integer> itrInt = list1.listIterator();
        while (itrInt.hasNext()) {
            Integer i = itrInt.next();
            if ((i > 100) || (i < 50)) {
                itrInt.remove();
            }
        }

        System.out.println("Print values after removing : " + list1);
        //Trying to remove items using a for loop or a for-each loop
        // would not work correctly because the collection is changing size
        // at the same time that the code is trying to loop

    }
}
