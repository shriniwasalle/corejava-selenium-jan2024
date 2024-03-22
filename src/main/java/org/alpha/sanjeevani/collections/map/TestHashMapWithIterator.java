package org.alpha.sanjeevani.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMapWithIterator {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "sanjeevani"); //pair/entry
        map.put(2, "sayaji");   //pair/entry
        map.put(3, "manisha");   //pair/entry
        map.put(4, "narayan");   //pair/entry
        map.put(5, "nitin");   //pair/entry
        map.put(6, "jija");    //pair/entry

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = entries.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
