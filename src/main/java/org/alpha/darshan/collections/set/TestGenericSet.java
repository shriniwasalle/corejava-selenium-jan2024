package org.alpha.darshan.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestGenericSet {

    public static void main(String[] args) {
        HashSet<String> sett= new HashSet<>();
        sett.add("darshan");
        sett.add("darshan2");
        sett.add("darshan3");

        for (String str:sett){
            System.out.println(str);
        }

        Iterator itr =sett.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
