package org.alpha.aishwarya.oopconcepts.abstraction;

import org.alpha.shriniwas.oopsconcepts.abstraction.abstractclass.TestAbstractClass;

public class TestBike extends TestAbstractClass {

        @Override
        public void wheels() {
            System.out.println("2 wheels");

        }

        @Override
        public void m1() {
            System.out.println("Inside TestAbstractClass Bike : m1 Method");

        }

    public static void main(String[] args) {
            TestAbstractClass obj = new TestBike();
       obj.m2();
        obj.m1();
        obj.wheels();
    }
}
/** -- Output---
 *
 Inside TestAbstractClass :: m2 method
 Inside TestAbstractClass Bike : m1 Method
 2 wheels
 */