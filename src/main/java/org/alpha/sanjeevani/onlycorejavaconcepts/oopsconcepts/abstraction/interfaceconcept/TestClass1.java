package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.abstraction.interfaceconcept;

public class TestClass1 implements TestInterface1,TestInterface2 {

    public void m1(){
        System.out.println("I am in m1 method");
    }
    public void m2(){
        System.out.println("I am in m2 method");
    }
    public void m3(){
        System.out.println("I am in m3 method");
    }
    public void m4(){
        System.out.println("I am in m4 method");
    }
    public void m6(){
        System.out.println("I am in m6 method");
    }
    public void m9(){
        System.out.println("I am in m7 method");
    }
public static void main(String [] args){
    TestInterface1 ref=new TestClass1();
    ref.m1();
    ref.m2();
    ref.m3();
    ref.m4();
    ref.m6();
    ref.defaultMethod();
    TestInterface1.staticMethod();
    System.out.println(TestInterface1.str);

    TestInterface2 ref2=new TestClass1();
    ref2.m9();
    ref2.defaultMethod1();
    TestInterface2.staticMethod1();

}
}
