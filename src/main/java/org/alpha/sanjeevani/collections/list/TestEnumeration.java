package org.alpha.sanjeevani.collections.list;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class TestEnumeration {
    public static void main(String[] args) {
        Vector<String> obj = new Vector<>();
        obj.add("Shlok1");
        obj.add("Shlok2");
        obj.add("Shlok3");
        obj.add("Shlok4");

        System.out.println(obj);
        Enumeration<String> en = obj.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
