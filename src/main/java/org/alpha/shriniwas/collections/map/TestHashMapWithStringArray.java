package org.alpha.shriniwas.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMapWithStringArray {

    public static void main(String[] args) {

        String [] str1 = {"Shri1", "Shri2", "Shri3"};
        String [] str2 = {"Shri4", "Shri5", "Shri6"};

        HashMap<Integer, String[]> map = new HashMap<>();
        map.put(100, str1); // pair/entry
        map.put(200, str2); // pair/entry

        Collection<String []> c = map.values();

        for (String [] strArr : c) {

            for ( String str : strArr) {
                System.out.println(str);
            }
        }
    }
}
