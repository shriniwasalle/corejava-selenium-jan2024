package org.alpha.shriniwas.variables.instance;

import org.alpha.shriniwas.variables.Employee;

public class InstanceVariable {

    // Instance Variable
    int age;
    String name;
    boolean flag;

    // Instance Method
    public void m1() {
        // Direct Access

        age = 100;
        name = "Shri";
        flag = true;

        System.out.println(age); // 100
        System.out.println(name); // Shri
        System.out.println(flag); // true
    }

    // Instance Method
    public void m2() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);

        Employee emp = new Employee();
        System.out.println(emp.companyName); // Microsoft
    }

    // Instance Method
    public void m3() {
        System.out.println(age); // 100
        System.out.println(name); // Shri
        System.out.println(flag); // true
    }

    // Static Method
    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        obj.m2(); // default
        System.out.println("--------------------");
        obj.m1(); // init
        System.out.println("--------------------");
        obj.m3(); // use the values set in m1 method

        // You need to create an Object to access Instance variables inside static methods/area
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.flag);

        Employee emp = new Employee();
        System.out.println(emp.companyName); // Microsoft
    }
}
