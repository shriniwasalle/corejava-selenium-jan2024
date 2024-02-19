package org.alpha.shriniwas.constructor;

public class TestConstructor1 {

    // 0-args/0-param constructor
    public TestConstructor1() {
        int a = 100;
        int b = 200;
        System.out.println("I am in 0-args constructor");
        System.out.println("Addition is : " + a+b);
    }

    public static void main(String[] args) {
        TestConstructor1 obj1 = new TestConstructor1();
        TestConstructor1 obj2 = new TestConstructor1();

        // TestConstructor1 = Class
        // obj = reference variable
        // new TestConstructor1(); Object
        // = : assignment operator
        // new : keyword, is used to create an Object
        // TestConstructor1() : Constructor
    }
}
