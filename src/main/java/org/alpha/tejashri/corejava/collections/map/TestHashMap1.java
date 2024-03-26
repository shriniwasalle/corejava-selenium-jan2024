package org.alpha.tejashri.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        //Non-Generic values are added in map
        map.put(1, "Shri1");//1=Shri1
        map.put(2, "Shri2");
        map.put(4, "X");
        map.put(5, 'Y');
        map.put(false, "Shri3");
        map.put(6, 11.11);
        map.put("Teja", true);
        map.put('C', 99.9);

        System.out.println(map);//insertion order does not maintain/preserve
        //{1=Shri1, 2=Shri2, C=99.9, 4=X, 5=Y, false=Shri3, 6=11.11, Teja=true} : Group of Entries
    }
}
