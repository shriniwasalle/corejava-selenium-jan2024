package org.alpha.shriniwas.oopsconcepts.polymorphism.overloading;

public class TestOverloading3 {

    public static void m1(String [] args) {
        System.out.println("Inside string array");
        System.out.println(args);
    }

    public static void m1(String [] strArr, int [] intArr) {
        System.out.println("Inside string array, int array");
        System.out.println(strArr);
        System.out.println(intArr);
    }

    public static void main(String[] args) {
        String [] str = {"Shri1", "Shri2", "Shri3"};
        int [] intArr = {10, 20, 30};

        TestOverloading3.m1(str);
        TestOverloading3.m1(str, intArr);
    }
}
