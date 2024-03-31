package org.alpha.sanjeevani.onlycorejavaconcepts.oopsconcepts.polymorphism.overriding;

public class TestParent2 {
    public void m1() {
        System.out.println("I am in TestParent2 m1 method");
    }

    public void m2(String st) {
        System.out.println("I am in TestParent2 :: m2 method");
        System.out.println(st);
    }

    public void m3(int age, String st) {
        System.out.println("I am in TestParent2 :: m3 method");
        System.out.println(st);
        System.out.println(age);
    }
}
