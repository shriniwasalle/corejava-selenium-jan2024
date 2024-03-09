package org.alpha.tejashri.oopsconcepts.abstraction.abstractclass.constractors;

public class TestConstructorInACChild extends TestConstructorInACParent {
    // if you will not create this constructor still default constructor created by the compiler
    // & super will be the 1st statement
    //    public TestConstructorInACChild(){
    //        super(); // super will call to parent class
    //    }
    @Override
    public void m1() {
        System.out.println("Inside m1 method");
    }

    public static void main(String[] args) {
        TestConstructorInACParent obj = new TestConstructorInACChild();
        obj.m1();
    }
}

//----------Output--------
//Inside abstract class Constructor
//Inside m1 method