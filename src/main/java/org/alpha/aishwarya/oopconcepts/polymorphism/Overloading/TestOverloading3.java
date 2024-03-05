package org.alpha.aishwarya.oopconcepts.polymorphism.Overloading;

public class TestOverloading3 {

    public static void m1(String[] args) {
        System.out.println("Inside String array");
        System.out.println(args);
    }

    public static void m1(String[] strArr, int[] intArr) {
        System.out.println("Inside String array");
        System.out.println(strArr);
        System.out.println(intArr);

    }

    public static void main(String[] args) {
        String[] strArr = {"Aish", "Aish2", "Aish3"};
        int[] intArr = {10, 20, 30};

        TestOverloading3.m1(strArr);
        TestOverloading3.m1(strArr, intArr);

    }
}



