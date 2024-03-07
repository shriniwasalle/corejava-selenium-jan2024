package org.alpha.shriniwas.oopsconcepts.polymorphism.overloading;

public class TestOverloading1 {

    public void add(int a, int b) {
        System.out.println("Addition of A and B : " + a+b);
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition of A, B and C : " + a+b+c);
    }

    public void getData() {
        System.out.println("I am inside TestOverloading1:: getData method");
    }

    public static void main(String[] args) {
        TestOverloading1 obj = new TestOverloading1();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.getData();
    }
}
