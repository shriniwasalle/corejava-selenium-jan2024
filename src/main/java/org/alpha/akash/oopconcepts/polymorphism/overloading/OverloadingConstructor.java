package org.alpha.akash.oopconcepts.polymorphism.overloading;

public class OverloadingConstructor {
    OverloadingConstructor (int Age) {
        System.out.println("I am in Int Parameter Constructor");
    }
    OverloadingConstructor(String name) {
        System.out.println("I am Strng parameter Constuctor");
    }

    public static void main(int [] arr) {
        System.out.println("I am in Int Parameter main Constructor :" +arr);
        //main(new String[] { "Akash","Akki"}); you can not declare in String parameters

    }

    public static void main(String[] args) {
        new OverloadingConstructor(24);
        new OverloadingConstructor("Akash");
        main(new int [] {10,20,30});
    }
}
