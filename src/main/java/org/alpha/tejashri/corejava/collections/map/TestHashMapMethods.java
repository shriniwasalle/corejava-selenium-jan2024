package org.alpha.tejashri.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapMethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //Generic values are added in map
        map.put(100, "Shri1");//Entry/Pair
        map.put(200, "Shri2");
        map.put(300, "Shri3");
        map.put(400, "Shri4");
        map.put(500, "Shri5");
        map.put(600, "Shri6");
        map.put(700, "Shri6");//duplicate values are allowed

        System.out.println(map);//will give the Group of Entries in {Entry1, Entry2, 3, ....}

        System.out.println(map.size());// 7

        System.out.println(map.get(500)); //Shri5
        System.out.println(map.get(800)); //null, bcz there is no value associated with key 800
        // so by default value of string is null

        System.out.println(map.isEmpty());//false

        System.out.println(map.entrySet());//will give the set of entries [Entry1, Entry2, 3, .....]
        System.out.println(map.keySet());//will give the set of keys only [  ]
        System.out.println(map.values());//will give the set of values only [  ]

        System.out.println(map.containsKey(500));//true
        System.out.println(map.containsKey(800));//false

        System.out.println(map.containsValue("Shri2"));//true
        System.out.println(map.containsValue("Shri10"));//false

        map.remove(700);//will remove particular key entry from map/group of entries
        System.out.println("After removing particular entry : " + map);

        System.out.println(map.replace(600, "Shri6", "Shri666"));
        System.out.println("After replacing value : " + map);

        //System.out.println(map.putIfAbsent(700, "shri777"));//null
        map.putIfAbsent(700, "Shri7");//will add if & only if this entry is absent
        System.out.println("After putIfAbsent : " + map);

        Map<Integer, String> map1 = new HashMap<>();
        //Generic values are added in map
        map1.put(1000, "Shri111");//Entry/Pair
        map1.put(2000, "Shri222");

        map.putAll(map1);// adding all map1 into map
        System.out.println("After adding map1 into map : " + map);

        System.out.println(map.isEmpty()); //false

        map.clear();
        System.out.println(map);//{} will clear\empty the map entries

        System.out.println(map.isEmpty()); //true
    }
}
