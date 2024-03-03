package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverriding.methodhiding;

public class TestChildMethodHiding extends TestParentMethodHiding {

    public static void m1() {
        System.out.println("Child :: m1 method");
    }

    public static void main(String[] args) {
        TestChildMethodHiding obj1 = new TestChildMethodHiding();
        obj1.m1();// child m1 method
        // Here child class object with reference of child class itself


        TestParentMethodHiding obj2 = new TestChildMethodHiding();
        //TestChildMethodHiding() : object of child
        //TestParentMethodHiding : reference of parent class
        obj2.m1(); // Parent m1 method instead of child m1 method

        //Method Hiding : Child m1 method got Hide here bcoz
        //here child object created with reference of parent class but
        //Static methods are linked with classes, not with Objects
        // whoever class object but reference class of that object is matters

        TestParentMethodHiding obj3 = new TestParentMethodHiding();
        obj3.m1(); // obviously parent m1 method
    }
}

//--------Output----------
//Child :: m1 method
//Parent :: m1 method
//Parent :: m1 method