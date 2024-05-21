package org.alpha.darshan.variables.defaultvalues;

import org.alpha.darshan.variables.defaultvalues.Employee;
import org.alpha.darshan.variables.defaultvalues.Student;

public class TestDefaultValues {
    static byte b;

    static short s;

    static int in;

    static long l;

    static float f;

    static double dd;

    static boolean bb;

    static char ch;

    static String str;

    static  StringBuffer  sb;

    static Student st;

    static Employee emp;

    static String [] names;

    public static void main(String[] args) {

        System.out.println(b);
        System.out.println("--------Primitive Data Type---------");
        System.out.println("byte---->"+b);
        System.out.println("short---->"+s);
        System.out.println("int---->"+in);
        System.out.println("long---->"+l);
        System.out.println("float---->"+f);
        System.out.println("double---->"+dd);
        System.out.println("boolean---->"+bb);
        System.out.println("char---->"+ch);

        System.out.println("--------NonPrimitive Data Type---------");
        System.out.println("String---->"+b);
        System.out.println("StringBuffer---->"+sb);

        System.out.println("--------NonPrimitive Data Type---------");
        System.out.println("Student---->"+st);
        System.out.println("Employee---->"+emp);
        System.out.println("String array="+ names);

    }
}
