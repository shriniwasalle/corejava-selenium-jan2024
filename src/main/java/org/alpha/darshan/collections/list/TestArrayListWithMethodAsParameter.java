package org.alpha.darshan.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayListWithMethodAsParameter {


    Integer [] arr={100,200,300};

    ArrayList<Integer> listInt= new ArrayList<>(Arrays.asList(arr));


    public void getList(List<String> list){
//        System.out.println(str.get(0));
//        System.out.println(str.get(1));
//        System.out.println(str.get(2));

        for (String str: list){
            System.out.println(str);
        }
    }

    public ArrayList<Integer> getArrayListValues(){
        return listInt;
    }


    public static void main(String[] args) {

        List<String> list= new ArrayList();
        list.add("darshan1");
        list.add("darshan2");
        list.add("darshan3");

        TestArrayListWithMethodAsParameter p1= new TestArrayListWithMethodAsParameter();
        p1.getList(list);

        System.out.println(p1.getArrayListValues());

    }
}
