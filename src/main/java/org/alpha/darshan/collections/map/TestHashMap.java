package org.alpha.darshan.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        Map map= new HashMap();

        map.put(101,"darshan");
        map.put(102,"darshan1");
        map.put(103,"darshan2");
        map.put(104,"darshan3");
        map.put(105,"darshan3");
        map.put(105,"darshan6");

        System.out.println(map);

    }
}
