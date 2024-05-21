package org.alpha.darshan.collections.set;

import java.util.HashSet;

public class TestList {

    public static void main(String[] args) {

        HashSet sett= new HashSet();
        sett.add("darshan");
        sett.add("darshan2");
        sett.add(101);
        sett.add(10.5);
        sett.add("darshan3");

        System.out.println(sett);

        for (Object o: sett){
            if (o instanceof String){
             String st= (String)o;
                System.out.println(st.length());
            }if (o instanceof Integer){
                Integer i=(Integer)o;
                System.out.println(i);
            }if (o instanceof Double){
                Double dd=(Double)o;
                System.out.println(dd);
            }
        }
    }
}
