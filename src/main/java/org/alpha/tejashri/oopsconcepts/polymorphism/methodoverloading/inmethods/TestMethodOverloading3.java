package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading.inmethods;

public class TestMethodOverloading3 {

    public static void m1(String[] strArr1) {
        System.out.println("Inside String Array :: m1 method");
        // System.out.print(strArr1); it gives memory allocation

        // used for-each loop to print string array
        for (String str : strArr1) {
            System.out.print(str); // print - used to print in 1 line
        }
        System.out.println(); // println - used to go next line
    }

    public static void m1(String[] strArr2, int[] intArr2) {
        System.out.println("Inside String Array, int Array :: m1 method");
        //  System.out.println(strArr2); it gives memory allocation
        //  System.out.println(intArr2); it gives memory allocation

        // used for-each loop to print string array & int array
        for (String str : strArr2) {
            System.out.println(str);
        }

        for (int a : intArr2) {
            System.out.println(a);
        }
    }
    // These above 2 static m1 methods are overloaded -in same class, 2 same method names,
    // with diff parameters, with diff logic/behaviour

    public static void main(String[] args) {
        String[] strArr1 = {"Shri1", "Shri2", "Shri3"};
        String[] strArr2 = {"Teja1", "Teja2", "Teja3"};
        int[] intArr2 = {10, 20, 30};

        System.out.println();
        TestMethodOverloading3.m1(strArr1);
        TestMethodOverloading3.m1(strArr2, intArr2);
    }
}

//-------- output ---------------
//Inside String Array :: m1 method
//Shri1Shri2Shri3
//Inside String Array, int Array :: m1 method
//Teja1
//Teja2
//Teja3
//10
//20
//30