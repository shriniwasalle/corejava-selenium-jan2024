package org.alpha.darshan.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapIterator {

    public static void main(String[] args) {

        HashMap<Integer,String> map= new HashMap<>();
        map.put(101,"Darshan");
        map.put(102,"Darshan2");
        map.put(103,"Darshan3");
        map.put(104,"Darshan4");

      Set<Map.Entry<Integer,String>> st  =map.entrySet();

      Iterator<Map.Entry<Integer,String>> itr= st.iterator();

      while (itr.hasNext()){
          Map.Entry<Integer,String> entries=   itr.next();
          System.out.println(entries.getKey());
          System.out.println(entries.getValue());
      }
    }
}
