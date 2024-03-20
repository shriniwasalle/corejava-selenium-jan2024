package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListofList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // list parent of ArrayList

        list.add("Candy");
        list.add("Jhon");
        list.add("Josephe");

        List<String> list1 = new ArrayList<>(list); // adding list 2 = List1 passing Collection parameter

        System.out.println(list1);
    }
}

/**
 * ---- Output----
 * [Candy, Jhon, Josephe]
 */