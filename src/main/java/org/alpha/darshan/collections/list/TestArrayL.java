package org.alpha.darshan.collections.list;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayL {

    @Test
    public void arrayListTest(){

        ArrayList list= new ArrayList();

        list.add("darshan");
        list.add("101");
        list.add(202);
        list.add(null);
        list.add(null);



        ArrayList list2= new ArrayList();

        list2.add(list);
        list2.add(1000);
        System.out.println(list);
        for (int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
    }

}
