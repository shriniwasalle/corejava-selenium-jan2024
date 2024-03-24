package org.alpha.tejashri.corejava.collections.set;

import java.util.HashSet;

public class TestSet {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        //Non-generic values are added in set
        set.add("Tejashri");
        set.add(1000);
        set.add(true);
        set.add(99.9f);
        set.add(null); // can add only 1 null value bcz duplicate values not allowed
        //set.add(1000); // duplicate values are not allowed
        //set.add("Tejashri");
        System.out.println(set);

        for (Object obj:set){
            System.out.println(obj);
        }
    }
}
