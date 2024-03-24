package org.alpha.tejashri.corejava.oopsconcepts.polymorphism.methodoverloading.inconstructors;

public class TestOverloadingConstructors {

    // Constructor name should same as class name
    public TestOverloadingConstructors(int age) {
        System.out.println("I am in int Parameter Constructor : ");
        System.out.println(age);
    }

    public TestOverloadingConstructors(String str) {
        System.out.println("I am in String Parameter Constructor : ");
        System.out.println(str);
    }

    // These above 2 Constructors are overloaded -in same class, 2 same Constructors names,
    // with diff parameters, with diff logic/behaviour
    public static void main(String[] args) {
        new TestOverloadingConstructors(100);
        new TestOverloadingConstructors("Tejashri");
    }
}

//----------- Output --------
//I am in int Parameter Constructor :
//100
//I am in String Parameter Constructor :
//Tejashri