package org.alpha.akash.oopconcepts.abstractconcepts.abstractconcept;

public class Bike extends AbstractClass{
    @Override
    public void wheels() {
        System.out.println("Bike : This is Two Wheels");
    }

    @Override
    public void m1() {
        System.out.println("Bike : m1 Method");
    }

    @Override
    public void m2() {
        System.out.println("Bike : m2 method");
    }

    public static void main(String[] args) {
        // We can not create an object of abstract class
        // TestAbstractClass obj = new TestAbstractClass();
        AbstractClass obj = new Bike();
        obj.wheels(); // Parent class mwheels will call
        obj.m1();// Child class m1 will call
        obj.m2();// Child class m2 will call
    }
}
