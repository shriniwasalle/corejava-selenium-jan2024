package org.alpha.tejashri.corejava.collections.map;

import java.util.*;

public class TestHashMapWithArrayList {
    //1 key with multiple values
    //key = Integer
    // value = List<String> : multiple values
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
        map.put(100, list1); //100=[Shri1, Shri2, Shri3]
        map.put(200, list2);//200=[Shri4, Shri5, Shri6]
        map.put(300, Arrays.asList("Shri7", "Shri8", "Shri9"));//instead of creating list can use Arrays.asList & add values here

        System.out.println(map);//{100=[Shri1, Shri2, Shri3], 200=[Shri4, Shri5, Shri6], 300=[Shri7, Shri8, Shri9]}

        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<String>> entry : entries) {
            System.out.println(entry);
        }

        for (Map.Entry<Integer, List<String>> entry : entries) {
            System.out.println("Key : " + entry.getKey());
            //System.out.println("Values : " +entry.getValue());//Values : [Shri1, Shri2, Shri3]

            //Further iterating values are List<String>>
            List<String> values = entry.getValue();
            for (String value : values) {
                System.out.println("Value : " + value);
            }
        }
    }
}