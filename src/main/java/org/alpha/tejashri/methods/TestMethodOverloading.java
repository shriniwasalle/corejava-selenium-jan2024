package org.alpha.tejashri.methods;

public class TestMethodOverloading {

    // Here static method m1 is overloading 3 times with different parameters
    static int m1(int a, int b) {
        return (a + b);
    }

    static double m1(double x, double y) {
        return (x + y);
    }

    static String m1(String s1, String s2) {
       return s1 + s2;
    }

    public static void main(String[] args) {
        int num1 = m1(100, 200);
        double num2 = m1(300.5d, 500.5d);
        System.out.println("int : " +num1);
        System.out.println("double : " + num2);

        String str = m1("Teja", "shri");
        System.out.println(str);
    }

}
