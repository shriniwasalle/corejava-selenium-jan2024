package org.alpha.tejashri.corejava.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapWithValues {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //Generic values are added in map
        map.put(100, "Shri1");//Entry/Pair
        map.put(200, "Shri2");
        map.put(300, "Shri3");
        map.put(400, "Shri4");
        map.put(500, "Shri5");
        map.put(600, "Shri6");
        map.put(700, "Shri6");

        System.out.println("Map  : " +map);

        Set<Integer> keys = map.keySet();//Set<> used bcz keys can not be duplicate in Map
        //same as in Set duplicate objects not allowed

        System.out.println("Keys  : " +keys);
        System.out.println("----Iterating keySet with for each loop----");
        for (Integer key : keys) {
            System.out.println(key);
        }

        Collection<String> values = map.values();//Collection<> used instead of Set<>
        //bcz values can be duplicate in Map but in Set duplicate objects\values not allowed

        System.out.println("Values  : " +values);
        System.out.println("----Iterating values with for each loop----");
        for (String value : values) {
            System.out.println(value);
        }
    }
}
