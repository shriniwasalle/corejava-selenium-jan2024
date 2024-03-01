package org.alpha.tejashri.oopsconcepts.polymorphism.methodoverloading;

public class TestMethodOverloading2 {
    public void getData(String str, int age) {
        System.out.println("I am in String, int method");
        System.out.println(str);
        System.out.println(age);
    }

    public void getData(int age, String str) {
        System.out.println("I am in int, String method");
        System.out.println(age);
        System.out.println(str);
    }
    // These above 2 getDta methods are overloaded -in same class, 2 same method names,
    // with diff parameters, with diff logic/behaviour

    public static void main(String[] args) {
        // nameless object created
        // new TestMethodOverloading2().getData(100, "Teja");
        // new TestMethodOverloading2().getData("Shri", 200);

        TestMethodOverloading2 obj = new TestMethodOverloading2();
        obj.getData(100, "Teja");
        obj.getData("Shri", 200);
    }
}

//-------- output ---------------
//I am in int, String method
//100
//Teja
//I am in String, int method
//Shri
//200