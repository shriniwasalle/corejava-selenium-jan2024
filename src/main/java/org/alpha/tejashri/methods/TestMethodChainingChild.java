package org.alpha.tejashri.methods;

public class TestMethodChainingChild extends TestMethodChainingParent  {
    public void m1(){
//m2(); if m2 call here Stack Overflow Error will come means occurs Recursion/Repetitive
        System.out.println("I am in m1 Method");
    }
    public void m2(){
        m1();
        System.out.println("I am in m2 Method");
    }
    public void m3(){
        this.m2(); // Current class m2 method
        super.m2(); // Parent class m2 method
        System.out.println("I am in m3 Method");
        m4();
    }
    public static void main(String[] args) {
        new  TestMethodChainingChild().m3(); // o/p m1, m2, m3
        //new  TestMethodChainingChild().m2(); // o/p m1, m2
    }
}