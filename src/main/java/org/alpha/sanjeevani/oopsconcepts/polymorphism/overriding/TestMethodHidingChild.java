package org.alpha.sanjeevani.oopsconcepts.polymorphism.overriding;

public class TestMethodHidingChild extends TestMethodHidingParent{
    public static void m1(){
        System.out.println("I am in child :: static method");
    }

    public static void main(String[] args) {
        TestMethodHidingParent obj=new TestMethodHidingChild();
        obj.m1();
    }
}

