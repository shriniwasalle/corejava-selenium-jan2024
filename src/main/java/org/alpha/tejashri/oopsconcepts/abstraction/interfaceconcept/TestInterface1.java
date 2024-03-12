package org.alpha.tejashri.oopsconcepts.abstraction.interfaceconcept;

public interface TestInterface1 {
    // interface variables have public,static,final keyword by default, write or no need to write
    public static final String str1 = "Tejashri";
    int id = 1000;


    // interface methods have public,abstract keyword by default, write or no need to write
    public abstract void m1(); //Modifier abstract & public is redundant for interface methods, remove modifier

    public abstract void m2();

    public abstract void m3();

    public abstract void m5();

    public abstract void m7();

    public abstract void m10();

    //Non-abstract/concrete methods not allowed in interface
    //    public void m4(){
    //
    //    }

    // In Java 1.8
    default void defaultMethod1() {
        System.out.println("Inside TestInterface1 :: defaultmethod1");
    }

    public static void m9() { //Static methods can not be overridden
        System.out.println("Inside TestInterface1 :: Static method m9");
    }
}
