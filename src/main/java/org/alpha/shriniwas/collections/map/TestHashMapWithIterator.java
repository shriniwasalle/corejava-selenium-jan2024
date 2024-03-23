package org.alpha.shriniwas.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMapWithIterator {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Shri1"); // pair/entry
        map.put(200, "Shri2"); // pair/entry
        map.put(300, "Shri3"); // pair/entry
        map.put(400, "Shri4"); // pair/entry
        map.put(500, "Shri5"); // pair/entry
        map.put(600, "Shri6"); // pair/entry
        map.put(700, "Shri6"); // pair/entry

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = entries.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> en = itr.next();

            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }
    }
}
