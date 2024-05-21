package org.alpha.darshan.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapGeneric {

    public static void main(String[] args) {

        HashMap<Integer,String> map= new HashMap<>();
        map.put(101,"DARSHAN");
        map.put(102,"DARSHAN1");
        map.put(103,"DARSHAN2");
        map.put(104,"DARSHAN3");
        map.put(105,"DARSHAN4");
        map.put(106,"DARSHAN5");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(101));
        System.out.println(map.isEmpty());
        System.out.println(map.remove(106));
        System.out.println(map);

       Set<Map.Entry<Integer,String>> map1= map.entrySet();

       for (Map.Entry<Integer,String> a:map1){
           System.out.println(a.getKey());
           System.out.println(a.getValue());
        }
    }
}
