package org.alpha.tejashri.methods;

public class TestMethodWithoutParameter {
    //Non-static Method Or Instance Method

    public void m1() {
        System.out.println("I am in m1 Method");
    }

    public void m2() {
        System.out.println("I am in m2 Method");
    }

    public static void m3() {
        System.out.println("I am in m3 Method");
    }

    public static void main(String[] args) {
        TestMethodWithoutParameter obj = new TestMethodWithoutParameter();
        obj.m1();// Without Parameters
        obj.m2();// Without Parameters
        TestMethodWithoutParameter.m3();
    }
}