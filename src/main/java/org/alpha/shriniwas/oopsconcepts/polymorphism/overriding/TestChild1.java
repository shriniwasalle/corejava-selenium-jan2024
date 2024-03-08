package org.alpha.shriniwas.oopsconcepts.polymorphism.overriding;

public class TestChild1 extends TestParent1 {

    public void marry() {
        // Logic of GF
        System.out.println("Inside TestChild1 :: marry method");
    }

    public void m1() {
        System.out.println("Inside TestChild1 :: m1 method");
    }

    public static void main(String[] args) {
        // Case 1:
        // TestChild1 : Object of Child
        // TestChild1 : Reference of Child
        TestChild1 obj1 = new TestChild1(); // Valid
        obj1.marry();
        obj1.m1();

        // Compiler will check if marry method is present inside the "TestChild1" class
        // if it is present then JVM will call the marry method of whoever object is created

        // Case 2:
        // TestParent1 : Object of Parent
        // TestParent1 : Reference of Parent
        TestParent1 obj2 = new TestParent1(); // Valid
        obj2.marry();
        // obj2.m1();

        // Compiler will check if marry method is present inside the "TestParent1" class
        // if it is present then JVM will call the marry method of whoever object is created i.e TestParent1

        // Case 3:
        // TestChild1 : Object of TestChild1
        // TestParent1 : Reference of Parent
        TestParent1 obj3 = new TestChild1(); // Valid..Overriding happens here
        obj3.marry();
        // obj3.m1();

        // Compiler will check if marry method is present inside the "TestParent1" class
        // if it is present then, JVM at Runtime will call the marry method of whoever object is created i.e TestChild1
        // If method is not present inside Parent, then compilation error is thrown

        // Case 4:
        // TestChild1 obj4 = new TestParent1(); Invalid..

    }
}
