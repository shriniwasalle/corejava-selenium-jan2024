package org.alpha.aishwarya.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTressSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("Z");
        set.add("C");
        set.add("B");
        set.add("D");
       //  set.add(null); --> Comparison not possible here for null that's why NullPointer Expection displayed.
        System.out.println("Sorted Set List " + set);

    }
}
/** --- OUTPUT----
 * Sorted Set List [A, B, C, D, Z]
 */