package org.alpha.akash.oopconcepts.abstractconcepts.interfaceconcept;

public interface Interface1 {

    public static final String strname = "Akash";
    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
//    public void m4() {
//        
//    }
    
    void m5();
    public void m7();
    
    public void m10();



    //Java 1.8 versions
    public static void m9() {
        System.out.println("I am Static Inside M9 Method");
    }
    default void defauldMethod1(){
        System.out.println("I am defaultMethod1");
    }

//    public static void m11() {
//        System.out.println();
//    }
//
//    default void m11() {
//
//    }
    
}
