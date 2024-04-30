package org.alpha.akash.oopconcepts.polymorphism.overloading;

public class OverloadingArray {

    public static void m1 (String [] args) {
        System.out.println("I am String of M1 method");
        System.out.println("String Array:" +args);
    }
    public  static void m1(String[] strArr, int [] intArr) {
        System.out.println("I am String Array and Int Array of M1 method");
        System.out.println("String Array :" +strArr);
        System.out.println("Int Array :" +intArr);

    }

    public static void main(String[] args) {
        String [] str = {"Vaishavi","Akash","Akki"};
        int [] intArr = {10,20,30};
        OverloadingArray.m1(str);
        OverloadingArray.m1(str,intArr);
    }
}
