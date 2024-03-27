package org.alpha.sanjeevani.collections.map;

import java.util.*;

public class TestHashMapWithList {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("sanju");
        list1.add("manu");
        list1.add("nitu");

        List<String> list2 = new ArrayList<>();
        list2.add("vinu");
        list2.add("pamu");
        list2.add("tai");

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(100, list1);
        map.put(200, list2);
        map.put(300, Arrays.asList("shweta", "angad", "vedu", "shlok"));
        System.out.println(map);

        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();

        for (Map.Entry<Integer, List<String>> entry : entries) {

            Integer key = entry.getKey();
            System.out.println(key);


            List<String> values = entry.getValue();
            for (String value : values) {
                System.out.println(value);
            }
        }

    }
}
