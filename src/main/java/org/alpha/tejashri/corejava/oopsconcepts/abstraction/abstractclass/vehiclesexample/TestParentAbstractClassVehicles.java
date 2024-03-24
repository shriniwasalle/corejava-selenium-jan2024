package org.alpha.tejashri.corejava.oopsconcepts.abstraction.abstractclass.vehiclesexample;

public abstract class TestParentAbstractClassVehicles {

    //Abstract Method
    public abstract void wheels(); //public abstract method

    protected abstract void suspension(); //protected abstract method

    abstract void speed(); //default abstract method

    //Non-Abstract Methods
    void fuel() { //default method can access in same package not outside the package
        System.out.println("Inside TestAbstractParentClassVehicle :: default fuel method");
    }
    public static void breaks() { //static declared to Non-abstract methods
        System.out.println("Inside TestAbstractParentClassVehicle :: static breaks method");
    }
    // private methods can be declared as abstract method
    private void m1() { //private method can access within/inside class only
        System.out.println("Inside TestParentAbstractClassVehicle :: private m1 method");
    }
}
