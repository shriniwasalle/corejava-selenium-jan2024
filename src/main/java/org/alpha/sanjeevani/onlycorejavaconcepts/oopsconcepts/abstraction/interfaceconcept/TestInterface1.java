package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.abstraction.interfaceconcept;

public interface TestInterface1 {
    public static final String str ="Sanjeevani";
    // interface method has public abstract by default keyword
    void m1();
    void m2();
    void m3();
    void m4();

   // public void m5(){} we can not crete normal/non-abstract/concrete method in interface

     void m6();

  //from java 1.8 allows to create default method
     default void defaultMethod(){
         System.out.println("I am in default TestInterface1 method ");
     }
    //from java 1.8 allows to create static method

    public static void staticMethod(){
        System.out.println("I am in static TestInterface1 method ");
     }

}