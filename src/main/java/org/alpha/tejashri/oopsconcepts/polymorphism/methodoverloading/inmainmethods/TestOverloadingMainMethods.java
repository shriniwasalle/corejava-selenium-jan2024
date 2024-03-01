package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading.inmainmethods;

public class TestOverloadingMainMethods {

    public static void main(String str, int a) {
        System.out.println("I am in String & int parameters :: Main Method ");
        System.out.println(str + a);
    }

    public static void main(float f, long l) {
        System.out.println("I am in float parameter :: Main Method ");
        System.out.println(f);
        System.out.println(l);
        main(new String[]{"Shri1", "Shri2"});
    }

    // These above 2 main methods are overloaded -in same class, 2 same method names,
    // with diff parameters, with diff logic/behaviour
    public static void main(String[] args) { //without this type of main method the program can not be Run/executed
        main("Teja", 100);//without creating variables directly passed
        main(1000.5f, 10);
    }
}

//----------- Output --------
//I am in String & int parameters :: Main Method
//Teja100
//I am in float parameter :: Main Method
//1000.5
//10