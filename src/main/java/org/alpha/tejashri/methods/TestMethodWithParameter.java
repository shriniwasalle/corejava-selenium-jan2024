package org.alpha.tejashri.methods;

public class TestMethodWithParameter {
    public void addition(int a, int b) {
        System.out.println(a + b); // 100+200 , 200+400
    }

    public void addition(int a, int b, int c) {
        System.out.println(a + b + c); // 100+200+300 , 200+400+500
    }

    public static void main(String[] args) {
        TestMethodWithParameter obj = new TestMethodWithParameter();
        obj.addition(100, 200);
        obj.addition(10, 20); // called with same method with different data
        obj.addition(200, 400); // called with same method with different data
        obj.addition(100, 200, 300);
        obj.addition(10, 20, 30); // called with same method with different data
    }
}
