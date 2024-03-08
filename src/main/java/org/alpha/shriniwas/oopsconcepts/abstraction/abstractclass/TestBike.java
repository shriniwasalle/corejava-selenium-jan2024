package org.alpha.shriniwas.oopsconcepts.abstraction.abstractclass;

public class TestBike extends TestAbstractClass {

    @Override
    public void wheels() {
        System.out.println("2 Wheels");
    }

    @Override
    public void m1() {
        System.out.println("Inside TestBike :: m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Inside TestBike :: m2 method");
    }

    public static void main(String[] args) {
        TestAbstractClass obj = new TestBike();
        obj.m2(); // Parent class m2 will call
        obj.m1(); // Child class m1 will call
        obj.wheels(); // Child class wheels will call


    }
}
