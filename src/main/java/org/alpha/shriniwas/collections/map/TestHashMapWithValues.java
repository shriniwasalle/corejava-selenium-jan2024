package org.alpha.shriniwas.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMapWithValues {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Shri1"); // pair/entry
        map.put(200, "Shri2"); // pair/entry
        map.put(300, "Shri3"); // pair/entry
        map.put(400, "Shri4"); // pair/entry
        map.put(500, "Shri5"); // pair/entry
        map.put(600, "Shri6"); // pair/entry
        map.put(700, "Shri6"); // pair/entry

        Set<Integer> keys = map.keySet();

        System.out.println(keys);

        Collection<String> values= map.values();

        for (String value : values) {
            System.out.println(value);
        }
    }
}
