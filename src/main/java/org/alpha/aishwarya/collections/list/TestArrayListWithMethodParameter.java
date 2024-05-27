package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListWithMethodParameter {

    public void printListValues(List<String> list) {
        // ------Using For Each Loop-----
        for (String Str : list) { //Object type = String that's why on Left side String written
            System.out.println(Str);

        }

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Saga");
        list.add("Candy");
        list.add("Grika");

        TestArrayListWithMethodParameter obj = new TestArrayListWithMethodParameter();
        obj.printListValues(list); // if method (printListValues) mdhye iterate nahe keala tr optput Blank yeata.


    }

}
/** ---- OUTPUT----
 * Saga
 * Candy
 * Grika
 */