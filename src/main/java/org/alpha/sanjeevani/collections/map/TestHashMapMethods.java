package org.alpha.sanjeevani.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapMethods {
        public static void main(String[] args) {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "sanjeevani"); //pair/entry
            map.put(2, "sayaji");   //pair/entry
            map.put(3, "manisha");   //pair/entry
            map.put(4, "narayan");   //pair/entry
            map.put(5, "nitin");   //pair/entry
            map.put(6, "jija");    //pair/entry


            System.out.println("HashMap is :" + map);
            System.out.println("size of HashMap is :" + map.size()); //6
            System.out.println(map.get(5));//nitin
            System.out.println(map.get(6));//jija
            System.out.println(map.get(7));//null bcz there is no value associated with kay 7
            System.out.println(map.isEmpty());//false
           // map.clear();
           // System.out.println(map);//
            //System.out.println(map.isEmpty());//true
            map.remove(6);//value of 6th key is removed
            System.out.println(map);//{1=sanjeevani, 2=sayaji, 3=manisha, 4=narayan, 5=nitin}

            Set<Map.Entry<Integer,String>>entries=map.entrySet();

            for (Map.Entry<Integer,String> entry:entries){
                System.out.println(entry);
                System.out.println("---------------------------------");
                System.out.println(entry.getKey());// we can get only keys
                System.out.println("---------------------------------");
                System.out.println(entry.getValue());// we can get only values

                //other way----by storing in data types
                Integer key=entry.getKey();
                String value=entry.getValue();
                System.out.println("key is:"+key);
                System.out.println("value is:"+value);


            }

        }

}
