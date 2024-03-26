package org.alpha.tejashri.corejava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {
        // In LinkedHashMap Insertion order not maintained,
        // duplicate keys are not allowed, but duplicate values are allowed

        Map map = new HashMap();
        //Non-Generic values are added in map
        map.put(1, "Shri1");//1=Shri1
        map.put(20, "Shri2");
        map.put(3, "Shri3");
        map.put(10, "X");
        map.put(6, "Y");

        map.put(4, "Z"); // 4=Z but
        map.put(4, "W");//now 4=B, duplicate keys are not allowed
        // same kay with different value,
        // then it will overwrite the old value with new value

        map.put(80, "W");//duplicate values are allowed

        map.put(null, "A");//null=A
        map.put(null, "B");// now null=B, multiple null keys are not allowed,
        // same kay with different value,
        // then it will overwrite the old value with new value

        map.put(100, null);
        map.put(200, null);// multiple null values are allowed

        System.out.println(map);//insertion order not maintain/preserve
    }
}
