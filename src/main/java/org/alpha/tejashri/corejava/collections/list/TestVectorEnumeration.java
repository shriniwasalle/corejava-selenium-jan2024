package org.alpha.tejashri.corejava.collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVectorEnumeration {

    public static void main(String[] args) {
        //In Vector duplicate values are allowed, insertion order maintained
        Vector<String> obj = new Vector<>();
        obj.add("Shri1");
        obj.add("Shri3");
        obj.add("Shri2");
        obj.add("Shri3");
        obj.add("Shri5");
        obj.add("Shri4");
        System.out.println(obj);//insertion order maintained

        System.out.println("----Vector Iteration using for each loop---- ");
        for (String str : obj) {
            System.out.println(str);//insertion order maintained
        }

        //Get Enumeration Cursor for Vector to iterate
        Enumeration<String> en = obj.elements();
        System.out.println("----Enumeration Cursor Iteration using while loop---- ");
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());//insertion order maintained
        }

        //Get Iterator Cursor for Vector to iterate
        Iterator<String> itr = obj.iterator();
        System.out.println("----Iterator Cursor Iteration using while loop---- ");
        while (itr.hasNext()) {
            System.out.println(itr.next());//insertion order maintained
        }
    }
}
