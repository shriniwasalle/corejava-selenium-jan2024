package org.alpha.shriniwas.stringconcept;

public class TestString2 {

    public static void main(String[] args) {

        // Object way
        String s1 = new String("Java"); // 2 objects

        // String literal
        String s2 = "Hello"; // 1 object

        String s3 = "Hello"; // 0 objects

        String s4 = new String("Java"); // 1 object

        String s5 = "Java"; // 0 objects

        System.out.println("S1 : " +System.identityHashCode(s1));
        System.out.println("S2 : " +System.identityHashCode(s2));
        System.out.println("S3 : " +System.identityHashCode(s3));
        System.out.println("S4 : " +System.identityHashCode(s4));
        System.out.println("S5 : " +System.identityHashCode(s5));


        // What is the difference between == and equals()?

        // == : Address/Reference Comparison
        // equals() : Content Comparison

        System.out.println(s4 == s5); // false
        System.out.println(s2 == s3); // true
        System.out.println(s4.equals(s5));
    }
}
