package org.alpha.tejashri.corejava.oopsconcepts.polymorphism.methodoverriding.accessspecifier;

public class TestParentAccessSpecifier {
    protected void m1() {
        System.out.println("In side Parent m1 method");
    }

    void m2() {
        System.out.println("In side Parent m2 default method");
    }

    // can not override the private methods, can access within class
    private void m4() {
        System.out.println("In side Parent m4 private method");
    }
}
