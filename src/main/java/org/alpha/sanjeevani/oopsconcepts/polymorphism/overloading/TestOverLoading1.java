package org.alpha.sanjeevani.oopsconcepts.polymorphism.overloading;

public class TestOverLoading1 {
    public void add(int a, int b) {
        System.out.println("Addition of a and b is :" + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition of a,b and c is :" + (a + b + c));
    }

    public static void main(String[] args) {
        TestOverLoading1 obj = new TestOverLoading1();
        obj.add(20, 40);
        obj.add(20, 40, 60);
    }
}
