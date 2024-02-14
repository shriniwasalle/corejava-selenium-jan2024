package org.alpha.shriniwas.variables.staticvariable;

public class TestStaticVariable1 {

    // Static Variables
    static int age = 100;
    static String name = "Shriniwas";

    // Instance Method or Non-static method
    public void m1() {
        // 2. Direct Access
        System.out.println(age);
        System.out.println(name);
    }

    // Static Method
    public static void main(String[] args) {

        // 1. By using class name
        System.out.println(TestStaticVariable1.age); // by using class name
        System.out.println(TestStaticVariable1.name); // by using class name

        // 2. Direct Access
        System.out.println(age);
        System.out.println(name);

        // By using Object Creation
        TestStaticVariable1 obj1 = new TestStaticVariable1();
        System.out.println(obj1.age);
        System.out.println(obj1.name);

        System.out.println(Company.companyName);
    }
}
