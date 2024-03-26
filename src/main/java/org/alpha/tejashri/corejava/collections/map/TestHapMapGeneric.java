package org.alpha.tejashri.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHapMapGeneric {
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

        System.out.println(map);//will give the group of Entries
        System.out.println(map.size());// 7
    }
}
