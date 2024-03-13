package org.alpha.akash.oopconcepts.abstractconcepts.interfaceconcept;

public interface Interface2 {
    void m6();
    public void m7();
    public void m8();
    default void defaultmethod2() {
        System.out.println("I am in defaultmethod2() method");
    }
}
