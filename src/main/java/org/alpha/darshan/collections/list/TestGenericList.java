package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestGenericList {

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("darshan1");
        list.add("darshan2");
        list.add("darshan3");

        List<Integer> listInt= new ArrayList<>();
        listInt.add(101);
        listInt.add(102);
        listInt.add(103);

        System.out.println("-----------for each------------");
        for(String str:list){
            System.out.println(str);
        }
        System.out.println("-----------for loop------------");
        for (int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------for integer loop------------");
        for (int intrr:listInt){
            System.out.println(intrr);
        }
    }
}
