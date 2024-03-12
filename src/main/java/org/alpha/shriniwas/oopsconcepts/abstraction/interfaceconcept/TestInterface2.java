package org.alpha.shriniwas.oopsconcepts.abstraction.interfaceconcept;

public interface TestInterface2 {

    void m6();

    public void m7();

    public void m8();

    default void defaultMethod2() {
        System.out.println("Inside defaultMethod2");
    }
}
