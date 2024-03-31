package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.abstraction.abstractclass;

public class TestScooty extends TestAbstractClass {
    public void wheels() {
        System.out.println("I am in 2 wheeler TestScooty method");
    }
    public void m1(){
        System.out.println("I am in TestScooty :: m1 method");
    }
    public static void main(String[] args) {
        TestAbstractClass obj = new TestScooty();
        obj.wheels();
        obj.m1();
        obj.m2();
    }
}