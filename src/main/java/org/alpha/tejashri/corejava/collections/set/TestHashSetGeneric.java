package org.alpha.tejashri.corejava.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSetGeneric {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        //Generic String type values are added in set
        set.add("Shri1");
        set.add("Shri2");
        set.add("Shri3");
        set.add("Shri4");

        //Get Iterator of String type
        Iterator<String> itr = set.iterator();
        System.out.println("----Iteration Using while loop----");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("----Iteration Using for each loop----");
        for (String str : set){
            System.out.println(str);
        }
    }
}