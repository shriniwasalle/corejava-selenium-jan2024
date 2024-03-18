package org.alpha.tejashri.methods;

public class TestMethodWithParameter {
    public void addition(int a, int b) {
        System.out.println(a + b); // 100+200 , 200+400
    }

    public void addition(int a, int b, int c) {
        System.out.println(a + b + c); // 100+200+300 , 200+400+500
    }

    public static void myMethod(String names) {
        System.out.println(names + "Boppa");
        //names is a parameter, while Boppa is argument
    }

    public static void main(String[] args) {
        TestMethodWithParameter obj = new TestMethodWithParameter();
        obj.addition(100, 200);
        obj.addition(10, 20); // called with same method with different data
        obj.addition(200, 400); // called with same method with different data
        obj.addition(100, 200, 300);
        obj.addition(10, 20, 30); // called with same method with different data

        //names is a parameter, while Tejashri, Mahika and Anshika are arguments.
        myMethod("Tejashri ");// static method can call directly(without object)
        myMethod("Mahika ");
        myMethod("Anshika ");
    }
}
