package org.alpha.sanjeevani.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap1 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"sanjeevani");
        map.put(2,"manisha");
        map.put(3,"nitin");
        map.put(3,"nitu");//for duplicate key it won't get any compilation error
        //but at run time ,it will overwrite the old value to new value
        System.out.println(map);
    }
}
