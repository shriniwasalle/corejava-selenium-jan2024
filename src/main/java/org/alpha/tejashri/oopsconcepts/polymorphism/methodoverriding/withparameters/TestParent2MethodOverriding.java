package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverriding.withparameters;

public class TestParent2MethodOverriding {

    public void m1() {
        System.out.println("Inside TestParent2MethodOverriding :: m1 method");
    }

    public void m2(String st) {
        System.out.println("Inside TestParent2MethodOverriding :: m2 method : " + st);
    }

    public void m3(int age2, String s2) {
        System.out.println("Inside TestParent2MethodOverriding :: m3 method : " + age2+s2);
    }

    public void m4(float f) {
        System.out.println("Inside TestParent2MethodOverriding :: m4 method : " +f);
    }
}
