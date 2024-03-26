package org.alpha.tejashri.corejava.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestHashMapWithStringArray {
    public static void main(String[] args) {
        String[] str1 = {"Shri1", "Shri2", "Shri3"};
        String[] str2 = {"Mahi1", "Mahi2", "Mahi3"};
        String[] str3 = {"Anshu1", "Anshu2", "Anshu3"};

        Map<Integer, String[]> map = new HashMap<>();
        //Generic values are added in map
        map.put(100, str1);
        map.put(200, str2);
        map.put(430, str3);

        System.out.println("Map  : " + map);

        Collection<String[]> st = map.values();//Collection<> used instead of Set<>
        //bcz values can be duplicate in Map but in Set duplicate objects\values not allowed

        for (String[] stArr : st) {
            for (String str : stArr) {
                System.out.println(str);
            }
        }
    }

}
