package org.alpha.aishwarya.oopconcepts.polymorphism.Overridding;

public class TestMethodHidingChild extends TestMethodHidingParent {

    public static void m1() {
        System.out.println("Inside Child m1 method");
    }

    public static void main(String[] args) {

        //If object = Child class,still due to Static variable complier will call Parent class method.
        // Obj = Child and Reference = Parent called Method Hiding Concept
        TestMethodHidingParent obj = new TestMethodHidingChild();
        obj.m1();

    }

}
/**
 * --------OUTPUT-------
 * Inside Parent M1 Method
 */