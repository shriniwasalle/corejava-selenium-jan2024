package org.alpha.aishwarya.oopconcepts.polymorphism.Overridding;

public class TestChild1 extends TestParent1 {
    @Override
    public void marry() {   //Girl own choice Boy
        System.out.println("Inside TestChild :Marry Method");
    }

    public static void main(String[] args) {
        // Case 1
        TestChild1 obj1 = new TestChild1();
        obj1.marry();    // op = Child class method called

        //Case 2
        TestParent1 obj2 = new TestParent1();
        obj2.marry();   // op = Parent class method called

        // Actual Overriding take place
        TestParent1 obj3 = new TestChild1();
        obj3.marry();     // OP = Child method called

    }
}


/**
 * ---Output---
 * Inside TestChild :Marry Method
 * Inside TestParent : Marry method
 * Inside TestChild :Marry Method
 */