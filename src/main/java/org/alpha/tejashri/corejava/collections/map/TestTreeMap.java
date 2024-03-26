package org.alpha.tejashri.corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        //In TreeMap insertion order does not maintained but Sorting order maintained/preserved
        Map<Integer, Character> map = new TreeMap();
        //Generic values are added in map
        map.put(10, 'A');//1=Shri1
        map.put(2, 'Z');
        map.put(4, 'X');
        map.put(5, 'Y');
        map.put(7, 'B');
        map.put(1, 'V');
        map.put(6, 'D');
        map.put(8, 'E');
        map.put(9, 'C');
        map.put(3, 'S');
        System.out.println(map);//Sorting order maintained/preserved

        Map<Integer, Float> map1 = new TreeMap();
        //Generic values are added in map
        map1.put(100, 0.00f);//1=Shri1
        map1.put(20, 77.9f);
        map1.put(40, 34.87f);
        map1.put(50, 67.45f);
        map1.put(70, 12.58f);
        map1.put(10, 23.569f);
        map1.put(60, 087.56f);
        map1.put(80, 489.789f);
        map1.put(90, 09.23f);
        map1.put(30, 82.033f);
        System.out.println(map1);//Sorting order maintained/preserved
    }
}
