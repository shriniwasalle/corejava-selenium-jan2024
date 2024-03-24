package org.alpha.tejashri.corejava.oopsconcepts.abstraction.abstractclass;

public abstract class TestParentAbstractClass {
    public String name = "Tejashri";


    //Abstract Method
    public abstract void m1();

    // we can not declare static to be abstract methods
    //public static abstract void m2();
    // if declared then static methods can not be overridden
    // & if we call this method by using class name then we don't get any implementation out of it

    //Non-Abstract Method
    public void m3(){
        System.out.println("In side TestAbstractParentClass : Non-abstract : m3 method");
    }

    // we can declare static to be Non-abstract methods
    public static void m4(){
        System.out.println("In side TestAbstractParentClass : static Non-abstract : m4 method");
    }

    // In abstract class main method can create
    public static void main(String[] args) {

    }
}
