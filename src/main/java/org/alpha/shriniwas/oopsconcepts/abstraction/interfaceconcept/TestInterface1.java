package org.alpha.shriniwas.oopsconcepts.abstraction.interfaceconcept;

public interface TestInterface1 {

    public static final String str = "Shriniwas";

    // Interface methods has public , abstract keywords by default
    public abstract void m1();
    public abstract void m2();

    public abstract void m3();

    void m5();

//    public void m4() {
//
//    }

    public void m7();

    public void m10();


    // Java 1.8
    default void defaultMethod1() {
        System.out.println("Inside defaultMethod1");
    }

    public static void m9() {
        System.out.println("Inside Static Methods");
    }

//    public static void m11() {
//        System.out.println();
//    }

//    default void m11() {
//
//    }
}
