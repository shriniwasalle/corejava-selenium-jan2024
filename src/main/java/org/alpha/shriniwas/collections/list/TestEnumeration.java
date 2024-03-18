package org.alpha.shriniwas.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

    public static void main(String[] args) {
        Vector<String> obj = new Vector<>();
        obj.add("Shri1");
        obj.add("Shri2");
        obj.add("Shri3");

        Enumeration<String> en = obj.elements();

        while(en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
