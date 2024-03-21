package org.alpha.shriniwas.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapMethods {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Shri1"); // pair/entry
        map.put(200, "Shri2"); // pair/entry
        map.put(300, "Shri3"); // pair/entry
        map.put(400, "Shri4"); // pair/entry
        map.put(500, "Shri5"); // pair/entry
        map.put(600, "Shri6"); // pair/entry
        map.put(700, "Shri6"); // pair/entry

        System.out.println(map);
        System.out.println(map.size()); // 7
        System.out.println(map.get(100));
        System.out.println(map.get(700));
        System.out.println(map.get(800)); // null , bcz there is no value associated with key 800
        System.out.println(map.isEmpty());

        // map.clear();

        System.out.println(map);
        // System.out.println(map.isEmpty());

        map.remove(700);

        System.out.println(map);

        // entries = {400=Shri4, 100=Shri1, 500=Shri5, 200=Shri2, 600=Shri6, 300=Shri3}
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Key: " +key);
            System.out.println("Value: " +value);
        }
    }
}
