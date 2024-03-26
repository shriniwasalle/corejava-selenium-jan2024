package org.alpha.tejashri.corejava.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapWithIterator {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //Generic values are added in map
        map.put(100, "Shri1");//Entry/Pair
        map.put(200, "Shri2");
        map.put(300, "Shri3");
        map.put(400, "Shri4");
        map.put(500, "Shri5");
        map.put(600, "Shri6");

        System.out.println(map);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = entries.iterator();

        System.out.println("----Iteration using while loop----------");
        while (itr.hasNext()) {
            Map.Entry<Integer, String> en = itr.next();
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }

//        Different ways to iterate/print

//        while (itr.hasNext()){
//        Map.Entry<Integer, String> en = itr.next();
//            System.out.println("Key : " + en.getKey() + ", value : " + en.getValue());
//        }
//        while (itr.hasNext()){
//            System.out.println(itr.next());// will iterate entries <K,V> both
//        }
//        while (itr.hasNext()){
//            Map.Entry<Integer, String> enKey = itr.next();
//            System.out.println(enKey.getKey());// will iterate only keys
//        }
//        while (itr.hasNext()){
//            Map.Entry<Integer, String> enValue = itr.next();
//            System.out.println(enValue.getKey());// will iterate only values
//        }


    }
}
