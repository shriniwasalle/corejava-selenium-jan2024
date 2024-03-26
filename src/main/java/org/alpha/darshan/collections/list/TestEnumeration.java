package org.alpha.darshan.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

    public static void main(String[] args) {

        Vector<String> obj= new Vector<>();
        obj.add("darshan");
        obj.add("gaikwad");
        obj.add("darshan2");


       Enumeration<String> en= obj.elements();

       while (en.hasMoreElements()){
           System.out.println(en.nextElement());
       }
    }
}
