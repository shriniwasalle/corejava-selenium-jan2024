package org.alpha.tejashri.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayListWithMethodParameter {
    Integer[] arr = {10, 20, 30};
    ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(arr));
    ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(100, 200, 300));

    //Arrays.asList() it passes the created arr Array into list/collection
    public void printListValues(List<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }

    public ArrayList<Integer> getListValues() {
        return integerList;
    }
    public ArrayList<Integer> getIntListValues() {
        return intList;
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //ArrayList<String> list = new ArrayList<>(); can also allow bcz Arraylist is parent class of List class
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");

        TestArrayListWithMethodParameter obj = new TestArrayListWithMethodParameter();
        obj.printListValues(list);

        System.out.println(obj.getListValues());
        System.out.println(obj.getIntListValues());
    }
}
