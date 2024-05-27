package org.alpha.aishwarya.oopconcepts.inheritance;

public class TestChild1 extends TestParent1 {
    int age = 50;

    public void getData() {
        System.out.println(age);
        System.out.println(id);
        System.out.println(super.age);
        super.getDetails();
    }

    public static void main(String[] args) {
        TestChild1 obj = new TestChild1();
        obj.getData();


        TestParent1 obj1 = new TestParent1();
        System.out.println(obj1.id);
        System.out.println(" Parent class object Calling  " + obj1.age);
        System.out.println("Child class object calling " + obj.age);

        TestGrandParent1 obj3 = new TestGrandParent1();
        System.out.println("GrandParent Class Object Calling " + obj3.age);
    }
}
