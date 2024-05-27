package org.alpha.aishwarya.methods;

public class TestMethodChainingChild extends TestMethodChainingParent {

    public void m1() {
        //m2(); // if we call m1() method in m2 method then stack overflow issue occurs ( Recurrsing)
        System.out.println("I am in m1 method");
    }

    public void m2() {
        // m1();
        m4(); // parent class method called
        // this.m2(); we can not call m2 method on same method.
        System.out.println("i am in Test Method Chaining :: m2 Method");
    }

    public void m3() {
        m1();
        this.m2(); // call current class method
        super.m2(); // call parent call method
        System.out.println("I am in m3 method");

    }

    public static void main(String[] args) {

        TestMethodChainingChild obj = new TestMethodChainingChild();
        obj.m3();

    }

}

/**
 * ==== Output ====
 * I am in m1 method
 * I am in m4 method
 * i am in Test Method Chaining :: m2 Method
 * I am in parent class m2 method
 * I am in m3 method
 */