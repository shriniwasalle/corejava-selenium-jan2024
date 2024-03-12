package org.alpha.tejashri.oopsconcepts.abstraction.interfaceconcept;

public class TestClassB {
    float salary = 10000.5f;
    static char ch = 'Z';

    public static void m11() {
        System.out.println("Inside TestClassB :: static m11 method ");
    }

    void m12() {
        System.out.println("Inside TestClassB :: m12 method ");
    }

    public static void main(String[] args) {
        System.out.println("---------TestClassA with obj of TestClassA -----------");
        TestClassA ref2 = new TestClassA();
        ref2.m6();
        ref2.m7();
        ref2.m8();
        ref2.defaultMethod2();
        System.out.println("String str2 value in TestInterface2 = " + ref2.str2);

        System.out.println("---------TestInterface1 with obj of TestClassA-----------");
        TestInterface1 ref1 = new TestClassA();
        ref1.m1();
        ref1.m2();

        System.out.println("---------TestClassB with obj of TestClassB-----------");
        //static variables/methods can access without obj
        System.out.println("Character = " + TestClassB.ch);
        TestClassB.m11();// static method

        TestClassB obj = new TestClassB();
        obj.m12();
        System.out.println("Salary = " + obj.salary);
    }
}

//---------output--------
//---------TestClassA with obj of TestClassA -----------
//Inside m6 method
//Inside m7 method
//Inside m8 method
//Inside TestInterface2 :: defaultmethod2
//String str2 value in TestInterface2 = Shri
//---------TestInterface1 with obj of TestClassA-----------
//Inside m1 method
//Inside m2 method
//---------TestClassB with obj of TestClassB-----------
//Character = Z
//Inside TestClassB :: static m11 method
//Inside TestClassB :: m12 method
//Salary = 10000.5