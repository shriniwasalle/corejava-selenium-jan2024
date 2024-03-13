package org.alpha.akash.oopconcepts.abstractconcepts.abstractconcept;

public class Auto extends AbstractClass {

    @Override
    public void wheels() {
        System.out.println("Auto : This is Tree Wheel");
    }

    @Override
    public void m1() {
        System.out.println("Auto : m1 Method");

    }

    public static void main(String[] args) {
        // We can not create an object of abstract class
        // TestAbstractClass obj = new TestAbstractClass();
        AbstractClass obj = new Auto();
        obj.wheels(); // Parent class mwheels will call
        obj.m1(); // Child class m1 will call
        obj.m2();// Parent class m2 will call
    }
}
