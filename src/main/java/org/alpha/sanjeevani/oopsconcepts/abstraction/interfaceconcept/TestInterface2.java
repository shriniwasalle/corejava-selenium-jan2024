package org.alpha.sanjeevani.oopsconcepts.abstraction.interfaceconcept;

public interface TestInterface2 {
    void m9();

    default void defaultMethod1(){
        System.out.println("I am in default TestInterface2 method ");
    }
    public static void staticMethod1(){
        System.out.println("I am in static TestInterface2 method ");
    }
}
