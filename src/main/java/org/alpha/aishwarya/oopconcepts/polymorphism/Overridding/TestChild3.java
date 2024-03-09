package org.alpha.aishwarya.oopconcepts.polymorphism.Overridding;

public class TestChild3 extends TestParent3 {
    public void m1(String str, int age) {
        System.out.println("Inside TestChild m1 method " + str + age);
    }

    public void m2(int age, String str) {
        System.out.println("Inside TestChild m2 method " + age + str);

    }


    public static void main(String[] args) {
        //Object number 1
        TestChild3 obj = new TestChild3();
        obj.m1("Candy", 10);
        obj.m2(11, "Grika");

        // Object number 2
        TestParent3 obj1 = new TestParent3();
        obj1.m1(12, "Anjani");

        // Object number 3 -> Overriding = Prent Class referance and child class object
        TestParent3 obj2 = new TestChild3();
        obj.m1("Saga", 97);


    }
}
/**
 * --OUTput-- Overriding using multiple method parameters
 * Inside TestChild m1 method Candy10
 * Inside TestChild m2 method 11Grika
 * Inside TestParent method 12Anjani
 * Inside TestChild m1 method Saga97
 */
