package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading.withtypepromotion;

public class TestOverloadingWithTypePromotionInMainMethods {
    public static void main(float f) {
        System.out.println("I am in float parameter :: Main Method : " + f);

    }

    public static void main(char[] chArr) {
        System.out.println("I am in char[] parameter :: Main Method ");// gives memory  allocation
        for (char ch : chArr) {
            System.out.println(ch);
        }
    }

    public static void main(int[] arr) {
        System.out.println("I am in int [] parameter :: Main Method " + arr);// gives memory  allocation
        for (int a : arr) {
            System.out.println(a);
        }
    }

    // These above 3 main methods are overloaded -in same class, 3 same method names,
    // with diff parameters, with diff logic/behaviour
    public static void main(String[] args) {
        main(new int[]{1, 2, 3, 4,});
        main(new char[]{'a', 'b', 'c'});
        main(100.9f);
        System.out.println();
        System.out.println("-----Type Promotion-----");
        main('a'); // Type Promotion char->float - will give the ASCII values of lowercase a char
        main(1000); // Type Promotion int->float

        System.out.println();
        System.out.println("-----Type Promotion char[]->int[]-----");
        main(new int[]{'A', 'b', '[', '%', '&', '<', '/'});// Type Promotion char[]->int[]
        //will give the ASCII values of that char
    }
}

//----------Output---------
//I am in int [] parameter :: Main Method [I@6aaa5eb0
//1
//2
//3
//4
//I am in char[] parameter :: Main Method
//a
//b
//c
//I am in float parameter :: Main Method : 100.9
//
//-----Type Promotion-----
//I am in float parameter :: Main Method : 97.0
//I am in float parameter :: Main Method : 1000.0
//
//-----Type Promotion char[]->int[]-----
//I am in int [] parameter :: Main Method [I@79b4d0f
//65
//98
//91
//37
//38
//60
//47