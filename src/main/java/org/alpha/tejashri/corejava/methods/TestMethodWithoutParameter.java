package org.alpha.tejashri.corejava.methods;

public class TestMethodWithoutParameter {
    //Non-static Method Or Instance Method

    public void m1() { // after public static word is not added thats why non-static or instance method
        System.out.println("I am in m1 Method");
    }

    public void m2() {
        System.out.println("I am in m2 Method");
    }

    public static void m3() { // static used -> by directly using class name call

        System.out.println("I am in m3 Method"); }

    public void add() {
        int a = 100;
        int b = 200;
        System.out.println(a + b);
    }

    public void addition() {
        int a = 200;
        int b = 400;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        TestMethodWithoutParameter obj = new TestMethodWithoutParameter();
        obj.m1();// Without Parameters
        obj.m2();// Without Parameters
        TestMethodWithoutParameter.m3(); // directly called class name bcoz statics method
        obj.add();
        obj.addition();
    }
}