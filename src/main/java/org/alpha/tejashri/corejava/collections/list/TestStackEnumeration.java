package org.alpha.tejashri.corejava.collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class TestStackEnumeration {
    public static void main(String[] args) {
        //In Stack duplicate values are allowed, insertion order maintained
        Stack<Integer> obj = new Stack<>();
        obj.add(2000);
        obj.add(6000);
        obj.add(3000);
        obj.add(1000);
        obj.add(2000);
        obj.add(1000);
        obj.add(6000);
        System.out.println(obj);//insertion order maintained

        System.out.println("----Vector Iteration using for each loop---- ");
        for (Integer i : obj) {
            System.out.println(i);//insertion order maintained
        }

        //Get Enumeration Cursor for Stack to iterate
        Enumeration<Integer> en = obj.elements();
        System.out.println("----Enumeration Cursor Iteration using while loop---- ");
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());//insertion order maintained
        }

        //Get Iterator Cursor for Stack to iterate
        Iterator<Integer> itr = obj.iterator();
        System.out.println("----Iterator Cursor Iteration using while loop---- ");
        while (itr.hasNext()) {
            System.out.println(itr.next());//insertion order maintained
        }
    }
}
