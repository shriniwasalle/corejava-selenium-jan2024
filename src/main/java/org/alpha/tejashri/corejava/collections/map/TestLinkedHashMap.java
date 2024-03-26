package org.alpha.tejashri.corejava.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

    public static void main(String[] args) {
        // In LinkedHashMap Insertion order maintained
        Map map = new LinkedHashMap();
        //Non-Generic values are added in map
        map.put(1, "Shri1");//1=Shri1
        map.put(2, "Shri2");
        map.put('C' , 99.9);
        map.put(3, "X");
        map.put(4, 'Y');
        map.put(false, "Shri3");
        map.put(5, 11.11);
        map.put("Teja", true);

        System.out.println(map);//Insertion order maintained
    }
}
