package org.alpha.tejashri.corejava.methods;

public class TestMethodChaining {
    public void m1() {
        //m2(); if m2 call here Stack Overflow Error will come means occurs Recursion/Repetitive
        System.out.println("I am in m1 Method");
    }

    public void m2() {
        m1();
        System.out.println("I am in m2 Method");
    }

    public void m3() {
        m2();
        System.out.println("I am in m3 Method");
    }

    public static void main(String[] args) {
        new TestMethodChaining().m3(); // o/p m1, m2, m3
        new TestMethodChaining().m2(); // o/p m1, m2
    }
}