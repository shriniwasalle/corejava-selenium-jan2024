package org.alpha.akash.oopconcepts.abstractconcepts.abstractconcept;

import org.alpha.shriniwas.oopsconcepts.abstraction.abstractclass.TestAbstractClass;

public abstract class AbstractClass  {

    public String name = "Akash";

    //Abstract Method
    public abstract void wheels();

    //public static abstract void wheels(); Not possible to have static for abstract method

    public abstract void m1();


    public void m2() {
        System.out.println("AbstractClass : m2 Method");
    }

    // We can declare static to the non-abstract methods
    /*public static void m2() {
        System.out.println("Inside TestAbstractClass :: m2 method");
    }*/


    public static void main(String[] args) {

    }
}
