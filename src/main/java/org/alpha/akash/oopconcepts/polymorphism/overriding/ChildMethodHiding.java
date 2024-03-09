package org.alpha.akash.oopconcepts.polymorphism.overriding;

public class ChildMethodHiding extends ParentMethodHiding{

    ChildMethodHiding() {

    }

    public static void m1() {

        System.out.println("ChildMethodHiding class :: m1 method");

    }

    public  final void  m2() {

        System.out.println("ChildMethodHiding class :: m2 method");
    }

    public static void main(String[] args) {
        ParentMethodHiding obj = new ChildMethodHiding();
        obj.m1();
        // static methods are linked with classes, not the Objects
        // Method Hiding : TestMethodHidingChild m1 method got hide here.

        //        obj.m2();// invalid bcz refernce

    }
}
