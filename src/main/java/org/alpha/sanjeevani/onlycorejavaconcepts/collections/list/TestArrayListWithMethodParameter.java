package org.alpha.sanjeevani.onlycorejavaconcepts.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayListWithMethodParameter {
    Integer[] arr = {101, 202, 303};

    ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(arr));
    ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(11, 22, 33));

    public void printListValue(List<String> list) {
        System.out.println(list);
        for (String str : list) {
            System.out.println(str);
        }
    }

    public ArrayList<Integer> getListValue() {
        return integerList;
    }

    public ArrayList<Integer> getIntListValue() {
        return intList;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("vedant");
        list.add("shlok");
        list.add("angad");
        list.add("kaushal");
        list.add("kauntey");

        TestArrayListWithMethodParameter obj = new TestArrayListWithMethodParameter();
        obj.printListValue(list);
        /*ArrayList<Integer>ref=obj.integerList;
        System.out.println(ref);*/
        System.out.println(obj.getIntListValue());
        System.out.println(obj.getListValue());
    }
}
