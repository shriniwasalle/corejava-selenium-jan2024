package org.alpha.sanjeevani.collections.set;

import java.util.HashSet;

public class TestSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("TATA CARS");
        set.add("TATA punch");
        set.add("TATA nexon");
        set.add(9.5);
        set.add(11.5);
        set.add('A');
        set.add('A');// duplicate values are not allowed but if add any duplicate value "Set" won't print any duplicate value
        System.out.println(set);

        for (Object obj:set){
            System.out.println(obj);
        }

    }
}
