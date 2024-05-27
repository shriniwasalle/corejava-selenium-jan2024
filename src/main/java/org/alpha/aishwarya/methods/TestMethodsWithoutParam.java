package org.alpha.aishwarya.methods;

public class TestMethodsWithoutParam {

    public void m1(){ // Default method or Without Parameter Method
        int a=10;
        int b=10;
        System.out.println("I am in m1 method " +  (a+b));
    }

    public void m2(){
        System.out.println("I am in m2 method");
    }

    public void addition(){ // user defined method Name
        int a=100;
        int b=200;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        TestMethodsWithoutParam obj = new TestMethodsWithoutParam();
        obj.m1();
        obj.m2();
        obj.addition();

    }
}
/** --- Output----
 * I am in m1 method 20
 * I am in m2 method
 * 300
 */