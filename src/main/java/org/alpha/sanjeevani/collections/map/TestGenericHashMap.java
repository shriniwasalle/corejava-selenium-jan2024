package org.alpha.sanjeevani.collections.map;

import java.util.HashMap;

public class TestGenericHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "sanjeevani"); //pair/entry
        map.put(2, "sayaji");   //pair/entry
        map.put(3, "manisha");   //pair/entry
        map.put(4, "narayan");   //pair/entry
        map.put(5, "nitin");   //pair/entry
        map.put(6, "jija");    //pair/entry


        System.out.println("HashMap is :" + map);
        System.out.println("size of HashMap is :" + map.size());
    }
}
