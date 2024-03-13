package org.alpha.akash.oopconcepts.abstractconcepts.abstractconcept;

public class Car extends AbstractClass{

    @Override
    public void wheels() {
        System.out.println("Car : This is Four Wheels");
    }

    @Override
    public void m1() {
        System.out.println("Car : m1 Method");

    }

    public static void main(String[] args) {
        // We can not create an object of abstract class
        // TestAbstractClass obj = new TestAbstractClass();
        AbstractClass obj = new Car();
        obj.wheels();// Parent class mwheels will call
        obj.m1();// Child class m1 will call
        obj.m2();// Parent class m2 will call
    }
}
