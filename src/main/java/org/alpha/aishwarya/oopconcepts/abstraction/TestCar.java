package org.alpha.aishwarya.oopconcepts.abstraction;

public class TestCar extends TestAbstractClass {
    @Override
    public void wheels() {
        System.out.println("4 wheels");

    }

    @Override
    public void m1() {
        System.out.println("Inside TestAbstractClass : m1 Method");

    }

    public static void main(String[] args) {
        TestAbstractClass obj = new TestCar();
        obj.m2();
        obj.m1();
        obj.wheels();
    }
}

/**
 * --OUTPUT---
 * Inside TestAbstractClass Parent : m2 Method
 * Inside TestAbstractClass : m1 Method
 * 4 wheels
 */
