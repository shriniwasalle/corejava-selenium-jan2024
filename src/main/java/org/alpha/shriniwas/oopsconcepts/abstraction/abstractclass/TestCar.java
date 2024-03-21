package org.alpha.shriniwas.oopsconcepts.abstraction.abstractclass;

public class TestCar extends TestAbstractClass {

    @Override
    public void wheels() {
        System.out.println("4 Wheels");
    }

    @Override
    public void m1() {
        System.out.println("Inside TestCar :: m1 method");
    }

    public static void main(String[] args) {
        // We can not create an object of abstract class
        // TestAbstractClass obj = new TestAbstractClass();

        TestAbstractClass obj = new TestCar();
        obj.m2(); // Parent class m2 will call
        obj.m1(); // Child class m1 will call
        obj.wheels(); // Child class wheels will call

    }
}
