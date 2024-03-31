package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.abstraction.abstractclass;

public abstract class TestAbstractClass {

    public String name ="sanjeevani";
    public abstract void wheels();//abstract method it doesn't have any method body/logic and implementation
    //public static abstract void wheels(); not possible to have static for abstract method
    public abstract void m1();
    //non-abstract method
    public void m2(){
        System.out.println("I am in abstract :: m2 method ");
    }
    //we can declare static to the non-abstract method
    //public static void m2()
}
