package org.alpha.sanjeevani.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSetGeneric {
    public static void main(String[] args) {

        Set<String> str = new HashSet<>();
        str.add("sanju1");
        str.add("sanju2");
        str.add("sanju3");
        str.add("sanju4");
        System.out.println(str);
        for (String str1 : str) {
            System.out.println(str1);

            Iterator<String> itr = str.iterator();
            System.out.println(itr);// only print memory location and (#cade)
        }
        System.out.println("<----------------------------------------------->");
        Iterator<String> itr = str.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
