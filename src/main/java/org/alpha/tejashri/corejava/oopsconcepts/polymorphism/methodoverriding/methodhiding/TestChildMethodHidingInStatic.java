package org.alpha.tejashri.corejava.oopsconcepts.polymorphism.methodoverriding.methodhiding;

public class TestChildMethodHidingInStatic extends TestParentMethodHidingInStatic {

    public static void m1() {

        System.out.println("Child :: m1 method");
    }

    public static void main(String[] args) {
        TestChildMethodHidingInStatic obj1 = new TestChildMethodHidingInStatic();
        obj1.m1();// child m1 method
        // Here child class object with reference of child class itself


        TestParentMethodHidingInStatic obj2 = new TestChildMethodHidingInStatic();
        //TestChildMethodHiding() : object of child
        //TestParentMethodHiding : reference of parent class
        obj2.m1(); // Parent m1 method instead of child m1 method

        //Method Hiding : Child m1 method got Hide here bcoz
        //here child object created with reference of parent class but
        //Static methods are linked with classes, not with Objects
        // whoever class object but reference class of that object is matters

        TestParentMethodHidingInStatic obj3 = new TestParentMethodHidingInStatic();
        obj3.m1(); // obviously parent m1 method
    }
}

//--------Output----------
//Child :: m1 method
//Parent :: m1 method
//Parent :: m1 method