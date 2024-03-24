package org.alpha.tejashri.corejava.oopsconcepts.abstraction.interfaceconcept;

public interface TestInterface2 {
    String str2 = "Shri"; //public static final

    void m6();

    public abstract void m7();

    public abstract void m8();

    default void defaultMethod2() {
        System.out.println("Inside TestInterface2 :: defaultmethod2");
    }
}
