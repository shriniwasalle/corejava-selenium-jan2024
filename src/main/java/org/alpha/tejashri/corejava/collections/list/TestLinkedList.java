package org.alpha.tejashri.corejava.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
    public static void main(String[] args) {

        //In LinkedList duplicate values are allowed, insertion order maintained
        LinkedList<String> list = new LinkedList<>();
        list.add("Teja1");
        list.add("Teja2");
        list.add("Teja2");
        list.add("Teja3");
        list.add("Teja4");
        list.add("Teja5");
        list.add("Teja6");

        System.out.println(list);//Insertion order maintained

        System.out.println("----LinkedList Iteration using for each loop---- ");
        for (String str : list) {
            System.out.println(str);//insertion order maintained
        }

        //Get Iterator Cursor for LinkedList to iterate
        Iterator<String> itr = list.iterator();

        System.out.println("----Iteration in Forward/Natural Order using while loop---- ");
        while (itr.hasNext()) {
            System.out.println(itr.next());//insertion order maintained
        }

        //Get ListIterator Cursor for LinkedList to iterate
        ListIterator<String> itr1 = list.listIterator(list.size());

        //Now iteration start from index 7 (list.size()=7) means from Teja6| (after Teja6)
        //Now we can iterate the list in Backward/Reverse Order
        System.out.println("----Iteration in Backward/Reverse Order Using while loop----");
        while (itr1.hasPrevious()) {
            System.out.println(itr1.previous());
        }
    }
}