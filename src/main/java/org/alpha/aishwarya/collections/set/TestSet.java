package org.alpha.aishwarya.collections.set;
import java.util.HashSet;
public class TestSet {
    public static void main(String[] args) {

        //-----Using Non-Generic-------
        HashSet set = new HashSet();
        set.add("Aishwarya");
        set.add(100);
        set.add(100);
        set.add("true");

        System.out.println(set); // Insertion order NOT maintained

        System.out.println("====Using For Each Loop======");
        for(Object o :set){
            System.out.println(o);

        }
    }
}

/** ----Output----
 * [100, true, Aishwarya]
 * ====Using For Each Loop======
 * 100
 * true
 * Aishwarya
 */