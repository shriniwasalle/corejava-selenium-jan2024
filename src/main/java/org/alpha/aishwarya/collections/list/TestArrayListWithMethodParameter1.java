package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayListWithMethodParameter1 {
    //---Using ArrayList----
    Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 100, 100}; // Should use Wrapper class always premative data types not allowed.

    public ArrayList<Integer> getPrintValue() { // Void replaced with ArrayList<Integer>
        return integerlist;
    } //Method 1

    public ArrayList<Integer> getIntListValue() { // Void replaced with ArrayList<Integer>
        return intlist;
    } //Method 2

    ArrayList<Integer> integerlist = new ArrayList<>(Arrays.asList(arr)); // Collection created becz passing array

    ArrayList<Integer> intlist = new ArrayList<>(Arrays.asList(100, 200, 500, 700));  // OR Other way to call Array

    public static void main(String[] args) {

        TestArrayListWithMethodParameter1 obj = new TestArrayListWithMethodParameter1();
        System.out.println(obj.getPrintValue());
        System.out.println(obj.getIntListValue());


    }
}
/**
 * ---OutPut----
 * Using ArrayList 1: pass Arraylist
 * [10, 20, 30, 40, 50, 60, 70, 100, 100]
 * <p>
 * Other way to Call Array uisng Arrays.asList(values);
 * [100, 200, 500, 700]
 */