package org.alpha.shriniwas.collections.map;

import java.util.HashMap;

public class TestGenericHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "Shri1"); // pair/entry
        map.put(200, "Shri2"); // pair/entry
        map.put(300, "Shri3"); // pair/entry
        map.put(400, "Shri4"); // pair/entry
        map.put(500, "Shri5"); // pair/entry
        map.put(600, "Shri6"); // pair/entry
        map.put(700, "Shri6"); // pair/entry

        // {400=Shri4, 100=Shri1, 500=Shri5, 200=Shri2, 600=Shri6, 300=Shri3, 700=Shri6} : Group of Entries
        System.out.println(map);
        System.out.println(map.size());
    }
}
