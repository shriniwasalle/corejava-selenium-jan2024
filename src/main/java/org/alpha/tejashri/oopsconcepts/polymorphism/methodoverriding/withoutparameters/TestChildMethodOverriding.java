package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverriding.withoutparameters;

public class TestChildMethodOverriding extends TestParentMethodOverriding {

    public void marry() {
        //Logic of child girlfriend
        System.out.println("Inside Test child :: marry method");
    }

    public void m1() {
        System.out.println("Inside Test child :: m1 method");
    }

    public static void main(String[] args) {
        // Case 1:
        //TestChildMethodOverriding() : object of child
        //TestChildMethodOverriding : Reference of child

        TestChildMethodOverriding obj1 = new TestChildMethodOverriding();
        obj1.marry(); // called to child marry method
        // compiler will check will marry method present in side the TestChildMethodOverriding class
        // if it is present then JVM at Run time will call the marry method of whoever (child or parent) object is created
        obj1.m1();// present in child class

        // Case 2:
        //TestParentMethodOverriding() : object of parent
        //TestParentMethodOverriding : Reference of parent

        TestParentMethodOverriding obj2 = new TestParentMethodOverriding();
        obj2.marry(); // called to parent marry method
        // compiler will check will marry method present in side the TestParentMethodOverriding class
        // if it is present then JVM at Run time will call the marry method of whoever (child or parent) object created i.e. parent

        // Case 3:
        //TestChildMethodOverriding() : object of Child
        //TestParentMethodOverriding : Reference of parent

        TestParentMethodOverriding obj3 = new TestChildMethodOverriding(); // Valid--Overriding happens
        obj3.marry(); // This is called Overriding - called to Child marry method at run time
        // compiler will check will marry method present in side the TestParentMethodOverriding class
        // if it is present then JVM at Run time will call the marry method of whoever (child or parent) object created i.e. child
        // Here child object overtakes the parent reference & called to child method at the time of run
        // due of this it is called as Runtime polymorphism

        //obj3.m1(); //not present in parent class
        // if method not present inside Parent class, then compilation (before execution) error is thrown.


        // Case 4:
        // TestChildMethodOverriding obj4 = new TestParentMethodOverriding();// Invalid--this is not possible

    }


}
