package org.alpha.tejashri.corejava.oopsconcepts.abstraction.abstractclass;

public class TestChildAbstractClass extends TestParentAbstractClass {

    public void m1() {
        System.out.println("In side TestAbstractChildClass : abstract : m1 method");
    }

    public static void main(String[] args) {
        //abstract class as a reference can use for other class object
        TestParentAbstractClass obj = new TestChildAbstractClass();
        obj.m1(); //parent abstract method
        obj.m3(); //parent Non-abstract method

        TestParentAbstractClass.m4(); //parent Non-abstract static method
        // without object can call static methods bcoz linked with classes not with objects

        //abstract class object can not create
        //TestParentAbstractClass obj = new TestParentAbstractClass();
        //obj.m1(); //m1 is abstract method means no-body/implementation of m1 in parent class
        //then no use to call bcoz nothing will get in output

        //obj.m2(); //m2 is Non-abstract method
        //non-abstract method can call but abstract method can not call, it's not possible
        //so strict rule created by java that abstract class object can not be created
    }
}

//-----------Output------------
//In side TestAbstractChildClass : abstract : m1 method
//In side TestAbstractParentClass : Non-abstract : m3 method
//In side TestAbstractParentClass : static Non-abstract : m4 method