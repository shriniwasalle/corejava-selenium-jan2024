package org.alpha.aishwarya.oopconcepts.polymorphism.Overridding;

public class TestChild2 extends TestParent2 {

    @Override
    public void m1() {
        System.out.println("Inside Test Child M1 method");
    }


    public void m2(String str) {
        System.out.println("Inside TestChild M2 Method " + str);
    }


    public static void main(String[] args) {
        TestChild2 obj = new TestChild2();
        obj.m1();


        TestParent2 obj1 = new TestChild2();
        obj.m2("Aishwarya Run time Polymorphism: learning Overriding");

        TestParent2 obj2 = new TestParent2();
        obj.m2();


    }

}
/**
 * ---Outpyt of Run Time (Overriding) Polymophism
 * Inside Test Child M1 method
 * Inside TestChild M2 Method Aishwarya Run time Polymorphism: learning Overriding
 * Inside TestParent M2 Method
 */