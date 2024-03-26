package org.alpha.tejashri.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMapGeneric {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //Generic values are added in map
        map.put(100, "Shri1");//Entry/Pair
        map.put(200, "Shri2");
        map.put(300, "Shri3");
        map.put(400, "Shri4");
        map.put(500, "Shri5");
        map.put(600, "Shri6");

        System.out.println(map);
        //{400=Shri4, 100=Shri1, 500=Shri5, 200=Shri2, 600=Shri6, 300=Shri3}
        //{Entry1, Entry2, Entry3, Entry4, Entry5, Entry6} = Group of Entries

        //Iterating map Entries
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        System.out.println("----Iteration using for each loop----------");
        System.out.println("Iterating Entries in map :");
        for (Map.Entry<Integer, String> i : entries) {
            System.out.println(i);
        }

        System.out.println("Iterating only keys in map : ");
        for (Map.Entry<Integer, String> i : entries) {
            System.out.println(i.getKey());
        }

        System.out.println("Iterating only values in map :");
        for (Map.Entry<Integer, String> i : entries) {
            System.out.println(i.getValue());
        }
    }
}
