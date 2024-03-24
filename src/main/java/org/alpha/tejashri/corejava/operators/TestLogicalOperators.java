package org.alpha.tejashri.corejava.operators;

public class TestLogicalOperators {
    public static void main(String[] args) {
        int x = 10, y =20, z = 5;
        System.out.println("Logical and : " + ((x < y) && (x !=y)));
        System.out.println(((x > y) && (x != z)));

        System.out.println("Logical or : " + ((x < y) || (x !=y)));
        System.out.println(((x > y) || (x < z)));

        System.out.println("Logical not : " +(x !=y));
        System.out.println((!(x !=y)));
    }
}
