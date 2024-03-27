package org.alpha.shriniwas.oopsconcepts.polymorphism.overloading;

public class TestOverloading2 {

    public void getData(String str, int age) {
        System.out.println("I am in string, int method");
        System.out.println(str);
        System.out.println(age);
    }

    public void getData(int age, String str) {
        System.out.println("I am in int, string method");
        System.out.println(age);
        System.out.println(str);
    }

    public static void main(String[] args) {
        // new TestOverloading2().getData(100, "Shriniwas");
        TestOverloading2 obj  = new TestOverloading2();
        obj.getData(100, "Shriniwas");
        obj.getData("Anjali", 1000);
    }
}
