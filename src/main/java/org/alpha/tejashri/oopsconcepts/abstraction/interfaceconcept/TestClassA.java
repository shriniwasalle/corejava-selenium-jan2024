package org.alpha.tejashri.oopsconcepts.abstraction.interfaceconcept;

// multiple inheritance is possible in interface
public class TestClassA extends TestClassB implements TestInterface1, TestInterface2 {

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
        System.out.println("Inside m3 method");
    }

    @Override
    public void m5() {
        System.out.println("Inside m5 method");
    }

    @Override
    public void m6() {System.out.println("Inside m6 method");}
    //m6 implemented with access specifier public. scope increased from default->public

    @Override
    public void m7() {System.out.println("Inside m7 method");}
    //m7 present in both TestInterface1 & TestInterface2,
    //Multiple inheritance is possible in interface

    @Override
    public void m8() {System.out.println("Inside m8 method");}

    @Override
    public void m10() {System.out.println("Inside m10 method");}

    public static void main(String[] args) {
        System.out.println("---------TestClassB-----------");
        //static methods/variables can call without creating object also
        TestClassB.m11();
        System.out.println("Character = " + TestClassB.ch);

        TestClassB obj = new TestClassA();
        obj.m12();
        System.out.println("Salary value in TestClassB = " + obj.salary);

        System.out.println("---------TestInterface1-----------");
        //static methods/variables can call without creating object also
        TestInterface1.m9();
        System.out.println("String str1 value in TestInterface1 = " + TestInterface1.str1);
        System.out.println("integer id value in TestInterface1 = " + TestInterface1.id);

        //TestInterface1.str1 = "Shri"; //error:Cannot reassign a value to final variable 'str1' of TestInterface1

        TestInterface1 ref1 = new TestClassA();//Runtime polymorphism
        ref1.m1();
        ref1.m2();
        ref1.m3();
        ref1.m7();
        ref1.m10();
        ref1.defaultMethod1();

        System.out.println("---------TestInterface2-----------");
        System.out.println("String str2 value in TestInterface2 = " + TestInterface2.str2);
        TestInterface2 ref2 = new TestClassA();
        ref2.m6();
        ref2.m7();
        ref2.m8();
        ref2.defaultMethod2();
    }
}

//----------Output------------
//---------TestClassB-----------
//Inside TestClassB :: static m11 method
//Character = Z
//Inside TestClassB :: m12 method
//Salary value in TestClassB = 10000.5
//---------TestInterface1-----------
//Inside TestInterface1 :: Static method m9
//String str1 value in TestInterface1 = Tejashri
//integer id value in TestInterface1 = 1000
//Inside m1 method
//Inside m2 method
//Inside m3 method
//Inside m7 method
//Inside m10 method
//Inside TestInterface1 :: defaultmethod1
//---------TestInterface2-----------
//String str2 value in TestInterface2 = Shri
//Inside m6 method
//Inside m7 method
//Inside m8 method
//Inside TestInterface2 :: defaultmethod2