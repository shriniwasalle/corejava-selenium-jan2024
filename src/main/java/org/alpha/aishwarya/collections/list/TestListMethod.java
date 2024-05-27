package org.alpha.aishwarya.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestListMethod {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("Aish1");
        list.add("Aish2");
        list.add("Aish3");

        System.out.println(list); // [Aish1, Aish2, Aish3]
        System.out.println(list.add("Aish4")); // output: True : return boolean value krto

    }
}

/**
 * ------OutPut----
 * [Aish1, Aish2, Aish3]
 * true
 */