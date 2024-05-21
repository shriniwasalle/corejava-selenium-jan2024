package org.alpha.darshan.opponcept.interfaces;

public interface TestInterface {

    void m1();

    default void defaultMethod(){
        System.out.println("i am in default method");
    }
}