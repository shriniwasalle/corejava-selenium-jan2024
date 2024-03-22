package org.alpha.shriniwas.collections.map;

import java.util.*;

public class TestHashMapWithList {

    // 100, ["Shri1", "Anjali", "Rohit"]
    // 200, ["Shri2", "Anjali1", "Rohit1"]
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Shri1");
        list1.add("Shri2");
        list1.add("Shri3");

        List<String> list2 = new ArrayList<>();
        list2.add("Shri4");
        list2.add("Shri5");
        list2.add("Shri6");

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(100, list1); // 100 = ["Shri1", "Shri2", "Shri3"]
        map.put(200, list2); // 200 = ["Shri4", "Shri5", "Shri6"]
        map.put(300, Arrays.asList("Shri7", "Shri8", "Shri9"));

        // System.out.println(map); // {100=[Shri1, Shri2, Shri3], 200=[Shri4, Shri5, Shri6]}

        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();

        for (Map.Entry<Integer, List<String>> entry : entries) {
            Integer key = entry.getKey();
            System.out.println("Key: " +key);

            List<String> values = entry.getValue();

            for (String value : values) {
                System.out.println("Value: " +value);
            }
        }
    }
}
