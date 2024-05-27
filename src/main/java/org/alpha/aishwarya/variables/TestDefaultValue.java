package org.alpha.aishwarya.variables;

public class TestDefaultValue {
     static byte b;
     static short s;
     static int i;
     static float f;
     static double d;
     static long l;
     static boolean bb;
     static char ch;


     static String str;
     static StringBuffer sb;

     static Student st;
     static Employee emp;

     static String[] names;


    public static void main(String[] args) {
        System.out.println("--Primitive Data Types Default Values--");
        System.out.println("byte --> " +b);
        System.out.println("short --> " +s);
        System.out.println("int --> "+i);
        System.out.println("float --> " +f);
        System.out.println("double --> " +d);
        System.out.println("long --> " +l);
        System.out.println("char --> " +ch);

        System.out.println("--Non Primitive Data Types Default Values--");
         System.out.println("String --> "+str);
        System.out.println("StringBuffer --> "+sb);

        System.out.println("--User defined Types Default Values--");
        System.out.println("Student--> "+st);
        System.out.println("Employee --> "+emp);

        System.out.println("String Array --> "+names);

    }
}
