package org.alpha.sanjeevani.onlycorejavaconcepts.collections.map;

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

        /*while (itr.hasNext()) {

           Map.Entry<Integer, String>en= itr.next();
            System.out.println(en.getValue());
            System.out.println(en.getKey());
        }*/
        for (int i=1;i<= map.size()-1;i++){
           Map.Entry<Integer, String>en=itr.next();
            System.out.println(en.getKey());
            System.out.println(en.getValue());
            //System.out.print(map.get(i));
        }

    }
}
