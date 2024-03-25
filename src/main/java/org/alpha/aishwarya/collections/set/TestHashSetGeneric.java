package org.alpha.aishwarya.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetGeneric {
    public static void main(String[] args) {

        //-----Using Non-Generic-------
        Set<String> set = new HashSet<>();
        set.add("Aishwarya");
        set.add("Aish2");
        set.add("Aish3");
        set.add("true");

        System.out.println(set); // Insertion order NOT maintained

        System.out.println("====Using For Each Loop======");
        for (String str : set) { // String chya place Object(Non-Generic) asl tari Output yeata
            System.out.println(str);
        }
    }
}
/**
 * -----Output-----
 * [Aish2, Aish3, true, Aishwarya]
 * ====Using For Each Loop======
 * Aish2
 * Aish3
 * true
 * Aishwarya
 */