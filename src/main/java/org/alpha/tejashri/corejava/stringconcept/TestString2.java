package org.alpha.tejashri.corejava.stringconcept;

public class TestString2 {

    public static void main(String[] args) {
        // 1. Object way
        String s1 = new String("Java"); // Java is variable object, s1 is reference variable object
        // in Object way 'new' object created then
        // it goes 1st into HEAP memory then 2nd goes to SCP(String Constant Pool) memory,
        // with 2 objects/copies of Java.

        //2. String literal way
        String s2 = "Hello"; // in literal way directly goes to SCP, with 1 object/copy of Hello

        String s3 = "Hello"; // SCP duplicates not allowed. it refers to all ready existed Hello
        // with 0 objects/copies of Hello.

        String s4 = new String("Java"); //It creates 1st another new Java object/copy in HEAP memory
        // & Java already exist in SCP refers to that only.
        // with 1 object/copy of Java

        String s5 = "Java"; // 0 object/copy bcoz java object already exist SCP refers to that only

        System.out.println("S1: " + System.identityHashCode(s1)); // it prints memory address of that object
        System.out.println("S2: " + System.identityHashCode(s2));
        System.out.println("S3: " + System.identityHashCode(s3));
        System.out.println("S4: " + System.identityHashCode(s4));
        System.out.println("S5: " + System.identityHashCode(s5));

        // What is thr difference between == & equal()?
        // == : Address Comparison
        // equal( : Content Comparison
        System.out.println(s4 == s5); // false --> s4, s5 address different
        System.out.println(s2 == s3); // true --> s2, s3 address same
        System.out.println(s4.equals(s5)); // true --> s4=java, s5=Java content same
        System.out.println(s1.equals(s3)); // false --> s1=java, s3=Hello content different
        System.out.println(s2.equals(s3)); // true
    }
}

//Output:
//S1: 1134712904
//S2: 114132791
//S3: 114132791
//S4: 586617651
//S5: 328638398
//false
//true
//true
//false
//true