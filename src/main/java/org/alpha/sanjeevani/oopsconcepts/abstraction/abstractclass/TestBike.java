package org.alpha.sanjeevani.oopsconcepts.abstraction.abstractclass;

public class TestBike extends TestAbstractClass{
@Override
    public void wheels(){
        System.out.println("I am in 4 wheeler TestBike method");
    }
    public void m1(){
        System.out.println("I am in Testbike :: m1 method");
    }
    public static void main(String[] args) {
TestAbstractClass obj=new TestBike();//We can create an object of abstract class.
    obj.wheels();
    obj.m1();
    obj.m2();
    }
}
