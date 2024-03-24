package org.alpha.tejashri.corejava.oopsconcepts.polymorphism.methodoverloading.inmainmethods;

public class TestOverloadingMainMethods {

    public static void main(String str, int a) {
        System.out.println("I am in String & int parameters :: Main Method ");
        System.out.println(str + a);
    }

    public static void main(float f, long l) {
        System.out.println("I am in float & long parameters :: Main Method ");
        System.out.println(f);
        System.out.println(l);

        //main(new String[]{"Shri1", "Shri2"});//we can not call the executing main method in other methods
        // bcoz it gives stack overflow error
    }

    public static void main(int[] arr) {
        System.out.println("I am in int [] parameter :: Main Method " + arr);// gives memory  allocation
        for (int a : arr) {
            System.out.println(a);
        }
    }
    // These above 3 main methods are overloaded -in same class, 3 same method names,
    // with diff parameters, with diff logic/behaviour

    public static void main(String[] args) { //without this type of main method the program can not be Run/executed
        main("Teja", 100);//without creating variables directly passed
        main(1000.5f, 10);

        main(new int[]{1, 2, 3});
    }
}

//----------- Output --------
//I am in String & int parameters :: Main Method
//Teja100
//I am in float & long parameters :: Main Method
//1000.5
//10
//I am in int [] parameter :: Main Method [I@4cb2c100
//1
//2
//3