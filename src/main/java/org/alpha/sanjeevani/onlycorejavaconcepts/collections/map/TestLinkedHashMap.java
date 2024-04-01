package org.alpha.sanjeevani.onlycorejavaconcepts.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(101,"coreJava");
        linkedHashMap.put(102,"selenium");
        linkedHashMap.put(103,"testng");

        System.out.println(linkedHashMap);
        Set<Map.Entry<Integer,String>>entries=linkedHashMap.entrySet();

        for (Map.Entry<Integer,String>entry:entries){
            Integer key=entry.getKey();
            System.out.println(key);

            String value=entry.getValue();
            System.out.println(value);

        }

    }
}


//Difference is in LinkedHashMap is the insertion order is preserved/maintained

