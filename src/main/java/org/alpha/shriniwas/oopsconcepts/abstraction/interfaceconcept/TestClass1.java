package org.alpha.shriniwas.oopsconcepts.abstraction.interfaceconcept;

public class TestClass1 implements TestInterface1, TestInterface2 {
    @Override
    public void m1() {
        System.out.println("Inside m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Inside m2 method");
    }

    @Override
    public void m3() {
        System.out.println("Inside m4 method");
    }

    public void m5() {
        System.out.println("Inside m5 method");
    }

    @Override
    public void m7() {
        System.out.println("Inside Class :: m7 method");
    }

    @Override
    public void m8() {
        System.out.println("Inside Class :: m8 method");
    }

    @Override
    public void m10() {
        System.out.println("Inside Class :: m8 method");
    }

    @Override
    public void m6() {
        System.out.println("Inside m6 method");
    }

    public static void main(String[] args) {
        TestInterface1 obj1 = new TestClass1(); // RunTime Polymorphism
        obj1.m1();
        obj1.m2();
        obj1.m3();
        obj1.m5();
        obj1.defaultMethod1();
        TestInterface1.m9();
        // TestInterface1.str = "Alle"; Can not reassign a final variable
        obj1.m7();
        obj1.m10();

        System.out.println(TestInterface1.str);

        TestInterface2 obj2 = new TestClass1();
        obj2.m6();
        obj2.defaultMethod2();
        obj2.m7();
        obj2.m8();
    }
}
