package org.alpha.shriniwas.variables;

public class TestDefaultValues {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bb;
    static char ch;

    static String str;
    static StringBuffer sb;

    static Student st;
    static Employee emp;

    static String [] names;
    public static void main(String[] args) {

        System.out.println("------ Primitive Data Types ------");
        System.out.println("byte ---> " +b);
        System.out.println("short ---> " +s);
        System.out.println("int ---> " +i);
        System.out.println("long ---> " +l);
        System.out.println("float ---> " +f);
        System.out.println("double ---> " +d);
        System.out.println("boolean ---> " +bb);
        System.out.println("char ---> " +ch);

        System.out.println("------ Non Primitive Data Types ------");
        System.out.println("String ---> "+str);
        System.out.println("StringBuffer ---> "+sb);

        System.out.println("------ User Defined Class ------");
        System.out.println("Student ---> " +st);
        System.out.println("Employee ---> " +emp);

        System.out.println("String [] ---> " +names);
    }
}
