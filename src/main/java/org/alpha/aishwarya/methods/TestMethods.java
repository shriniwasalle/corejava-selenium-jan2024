package org.alpha.aishwarya.methods;

public class TestMethods {

    public void m1(){ // Default method
        int a=10;
        int b=10;

        System.out.println("I am in m1 method " +  (a+b));

    }

    public static void main(String[] args) {
        TestMethods obj = new TestMethods();
        obj.m1();

    }
}
