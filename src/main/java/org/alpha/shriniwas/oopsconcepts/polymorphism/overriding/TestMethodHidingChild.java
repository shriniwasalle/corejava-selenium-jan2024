package org.alpha.shriniwas.oopsconcepts.polymorphism.overriding;

public class TestMethodHidingChild extends TestMethodHidingParent {

    public static void m1() {
        System.out.println("Child :: m1 method");
    }

    public static void main(String[] args) {
        TestMethodHidingParent obj1 = new TestMethodHidingChild();
        obj1.m1();

        // static methods are linked with classes, not the Objects
        // Method Hiding : TestMethodHidingChild m1 method got hide here.
    }
}
