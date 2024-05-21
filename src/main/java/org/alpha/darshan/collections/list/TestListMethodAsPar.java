package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListMethodAsPar {

    Integer [] arr= {100,200,300};

    ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr));

    public void getDetailsMethod(List<String> str){
        for (String st:str){
            System.out.println(st);
        }
    }

    public ArrayList<Integer> getListValue(){
        return list2;
    }

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("darshan");
        list.add("darshan1");
        list.add("darshan2");

        TestListMethodAsPar par= new TestListMethodAsPar();
        par.getDetailsMethod(list);

        System.out.println(par.getListValue());
    }
}
