package org.alpha.ganesh.variables;

public class LocalVariables1 {

    // Block
    {
        int b = 100;
        System.out.println(b);
        // System.out.println(a);
    }

    // Constructor : Constructor name should be same as the class name
    LocalVariables1() {
        // Local Variable
        int a = 100;
        System.out.println(a);
        // System.out.println(age);
    }

    public void m1(String str) {
        str = "Shri";
        System.out.println(str);
    }

    // Method
    public static void main(String[] args) {
        // Local Variables
        int age = 100;

        String name;
        name = "Shri";
        System.out.println(name);

        int i = 10, j = 20;

        System.out.println(age);
    }
}
