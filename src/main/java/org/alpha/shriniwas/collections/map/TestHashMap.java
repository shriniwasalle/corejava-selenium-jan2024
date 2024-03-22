package org.alpha.shriniwas.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Shri1");
        map.put(2, "Shri2");
        map.put(3, "Shri3");
        map.put(4, "Z");
        map.put(5, "A");
        map.put(6, "B");
        map.put("Shrin", true);
        map.put('C', 100.3);

        System.out.println(map);
    }
}
