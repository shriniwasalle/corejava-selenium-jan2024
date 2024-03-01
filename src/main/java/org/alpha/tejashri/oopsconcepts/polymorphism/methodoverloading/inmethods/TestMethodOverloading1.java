package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading.inmethods;

public class TestMethodOverloading1 {

    public void add(int a, int b) {
        System.out.println("Addition of a & b : " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition of a & b : " + (a + b + c));
    }
    // These above 2 add methods are overloaded -in same class, 2 same method names,
    // with diff parameters, with diff logic/behaviour

    public void grtData() {
        System.out.println("I am inside TestMethodOverloading1 :: getData method ");

    }

    public static void main(String[] args) {
        TestMethodOverloading1 obj = new TestMethodOverloading1();
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}

//----------- Output --------
//Addition of a & b : 30
//Addition of a & b : 60