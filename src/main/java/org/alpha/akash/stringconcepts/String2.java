package org.alpha.akash.stringconcepts;

public class String2 {

    public static void main(String[] args) {

        //objects Way
        String s1 = new String("Java Concept's"); //2 objects

        //String Literal

        String  s2 = "Hello";//1 objects

        String s3 = "Hello"; // 0 objects

        String  s4 = new String("Java Concepts"); //1 objects

        String s5 = "Java Concepts";//0 objects


        System.out.println("S1 :- "+System.identityHashCode(s1));
        System.out.println("S2 :- "+System.identityHashCode(s2));
        System.out.println("S3 :- "+System.identityHashCode(s3));
        System.out.println("S4 :- "+System.identityHashCode(s4));
        System.out.println("S5 :- "+System.identityHashCode(s5));

        // What is the difference betwee == and equals()?

        // == : Address/ Reference comparision
        // equal() : Content Comparision

        System.out.println(s4 == s5);
        System.out.println(s2 == s5);
        System.out.println(s4 .equals(s5));
        System.out.println(s2.equals(s3) );



    }
}
