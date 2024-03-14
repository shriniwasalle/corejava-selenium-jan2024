package org.alpha.darshan.opponcept.interfaces;

import org.alpha.shriniwas.oopsconcepts.abstraction.interfaceconcept.TestInterface1;

public class TestInterfaceExample implements TestInterface, TestInterface2 {
    @Override
    public void m1() {
        System.out.println("i am in testinterfaceclass");
    }

    public static void main(String[] args) {
        TestInterface t1= new TestInterfaceExample();
        t1.m1();
        t1.defaultMethod();

        TestInterface2 t2= new TestInterfaceExample();
        t2.m1();
    }
}
