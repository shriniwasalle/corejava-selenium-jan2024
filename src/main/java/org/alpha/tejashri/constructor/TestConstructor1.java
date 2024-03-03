package org.alpha.tejashri.constructor;

public class TestConstructor1 {

    // 0- args / 0- parameter constructor
    public TestConstructor1() {
        int a = 100;
        int b = 200;

        System.out.println("I am in 0-args constructor");
        System.out.println("Addition is : " + (a + b));
    }

    public static void main(String[] args) {
        TestConstructor1 obj1 = new TestConstructor1(); // just created object constructor will call automatically
        TestConstructor1 obj2 = new TestConstructor1();

    //  TestConstructor1 = class
    //  obj = reference variable
    //  if we won't use new keyword, it won't create any object in memory
    //  new TestConstructor1(); is object
    //  = : assignment operator
    //  new : keyword is  used to create object
    //  TestConstructor1(); = is a constructor

    }
}
//Output
//I am in 0-args constructor
//Addition is : 300
//I am in 0-args constructor
//Addition is : 300