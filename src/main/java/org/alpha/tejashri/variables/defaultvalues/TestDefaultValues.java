package org.alpha.tejashri.variables.defaultvalues;

import org.alpha.tejashri.variables.Employee;
import org.alpha.tejashri.variables.Student;

public class TestDefaultValues {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char ch;
    static boolean bb;
    static String str;
    static  StringBuffer sb;
    static Student st;
    static Employee emp;

    public static void main(String[] args) {
        System.out.println("*********** Primitive Data Types ********");
        System.out.println("byte---->" +b); // by default value will print
        System.out.println("short---->" +s);
        System.out.println("int--->" +i);
        System.out.println("long---->" +l);
        System.out.println("float--->" +f);
        System.out.println("double---->" +d);
        System.out.println("character---->" +ch);
        System.out.println("boolean---->" +bb);

        System.out.println("*********** Non Primitive Data Types ********");

        System.out.println("String---->" +str);
        System.out.println("StringBuffer---->" +sb);

        System.out.println("*********** User Defined Classes ********");
        System.out.println("Student---->" +st);
        System.out.println("Employee---->" +emp);
    }
}
