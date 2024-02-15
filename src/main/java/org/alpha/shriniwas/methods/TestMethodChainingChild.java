package org.alpha.shriniwas.methods;

public class TestMethodChainingChild extends TestMethodChainingParent {

    public void m1() {
        // m2();
        System.out.println("I am in m1 method");
    }

    public void m2() {
        m1();
        System.out.println("I am in TestMethodChaining :: m2 method");
    }

    public void m3() {
        this.m2(); // Current Class m2 method
        super.m2(); // Parent Class m2 method
        System.out.println("I am in m3 method");
        m4();
    }

    public static void main(String[] args) {
        new TestMethodChainingChild().m3();
        // new TestMethodChaining().m2();
    }
}
