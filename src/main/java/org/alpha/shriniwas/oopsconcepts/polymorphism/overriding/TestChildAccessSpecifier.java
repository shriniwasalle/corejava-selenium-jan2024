package org.alpha.shriniwas.oopsconcepts.polymorphism.overriding;

public class TestChildAccessSpecifier extends TestParentAccessSpecifier {

    private void m1() {
        System.out.println("Inside Child m1 method");
    }

    public static void main(String[] args) {
        TestChildAccessSpecifier obj = new TestChildAccessSpecifier();
        obj.m1();
    }
}
