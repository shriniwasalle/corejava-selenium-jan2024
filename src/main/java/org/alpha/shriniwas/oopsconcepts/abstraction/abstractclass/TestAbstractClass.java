package org.alpha.shriniwas.oopsconcepts.abstraction.abstractclass;

public abstract class TestAbstractClass {

    public String name = "Shriniwas";

    // Abstract Method
    public abstract void wheels();

    // public static abstract void wheels(); Not possible to have static for abstract method

    public abstract void m1();

    // Non-Abstract Method
    public void m2() {
        System.out.println("Inside TestAbstractClass :: m2 method");
    }

    // We can declare static to the non-abstract methods
    /*public static void m2() {
        System.out.println("Inside TestAbstractClass :: m2 method");
    }*/

    public static void main(String[] args) {
    }
}
