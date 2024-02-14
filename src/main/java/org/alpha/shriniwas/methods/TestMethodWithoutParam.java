package org.alpha.shriniwas.methods;

public class TestMethodWithoutParam {

    // Non-Static Method or Instance Method
    public void m1() {
        System.out.println("I am in m1 method");
    }

    public void m2() {
        System.out.println("I am in m2 method");
    }

    public static void m3() {
        System.out.println("I am in m3 static method");
    }

    public void add() {
        int a = 100;
        int b = 200;
        System.out.println(a+b);
    }

    public void addition() {
        int a = 200;
        int b = 400;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        TestMethodWithoutParam obj = new TestMethodWithoutParam();
        obj.m1(); // Without Parameters
        obj.m2(); // Without Parameters
        TestMethodWithoutParam.m3();

        obj.add();
        obj.addition();

        Employee emp = new Employee();
        emp.getEmpData();
    }
}
