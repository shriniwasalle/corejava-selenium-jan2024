package org.alpha.akash.oopconcepts.polymorphism.overriding.child;

import org.alpha.akash.oopconcepts.polymorphism.overriding.parent.Parent1;

public class Child1 extends Parent1 {

//    public void marry(){
//        // Logic of Child GF
//        System.out.println("marry method Called from Child1");
//    }

    public void m1() {
        System.out.println("Child1 Class :: M1 method");
    }

    public static void main(String[] args) {
        // Case 1:
        // Child1 : Object of Child
        // Child1 : Reference of Child
        Child1 obj = new Child1();
        obj.marry();
        obj.m1();
        // Compiler will check if marry method is present inside the "Child1" class
        // if it is present then JVM will call the marry method of whoever object is created

        // Case 2:
        // TestParent1 : Object of Parent
        // TestParent1 : Reference of Parent
        Parent1 obj1 = new Parent1();
        obj1.marry();
//        obj1.m1(); //invalid

        // Case 3:
        // Child1 : Object of TestChild1
        // Parent1 : Reference of Parent
        Parent1 obj2 = new Child1();
        obj2.marry();// Valid..Overriding happens here
//        obj2.m1();//Invalid
        // Compiler will check if marry method is present inside the "TestParent1" class
        // if it is present then, JVM at Runtime will call the marry method of whoever object is created i.e TestChild1
        // If method is not present inside Parent, then compilation error is thrown

        // Case 4:
//         TestChild1 obj4 = new TestParent1(); // Invalid


    }
}




