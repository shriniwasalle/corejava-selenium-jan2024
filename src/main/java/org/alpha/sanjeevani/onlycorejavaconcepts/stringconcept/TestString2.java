package org.alpha.sanjeevani.onlycorejavaconcepts.stringconcept;

public class TestString2 {
    public static void main(String[] args) {
        //object way
        String s1=new String("java"); //object=2
        String s2="Hello"; //object 1
        String s3="Hello"; //0 object
        String s4=new String("java"); // 1 object
        String s5="java";  //0 object

        System.out.println("s1 :"+System.identityHashCode(s1));
        System.out.println("s2 :"+System.identityHashCode(s2));
        System.out.println("s3 :"+System.identityHashCode(s3));
        System.out.println("s4 :"+System.identityHashCode(s4));
        System.out.println("s5 :"+System.identityHashCode(s5));

        //difference between ==  and equals()

        //address/reference comparison
        //content comparison
        System.out.println(s4==s5); //false
        System.out.println(s2==s3); //true
        System.out.println(s4.equals(s5));//true

    }
}
