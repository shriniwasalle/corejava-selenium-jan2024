package org.alpha.tejashri.corejava.variables.instancevariables;

import org.alpha.tejashri.corejava.variables.Employee;

public class InstanceVariables {
    // Instance Variables
    int age;
    String name;
    boolean flag;

    // Instance Method
    public void m1() {
        // Direct Access

        age = 100;
        name = "Teja";
        flag = true;
        System.out.println(age); //100
        System.out.println(name); //Teja
        System.out.println(flag); //true
    }

    // Instance Method
    public void m2() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);

        Employee emp = new Employee();
        System.out.println(emp.companyName); //Microsoft
    }

    // Instance Method
    public void m3() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);
    }

    // Static Method
    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        obj.m2(); // Default values
        System.out.println("--------------------------");
        obj.m1(); //init
        System.out.println("--------------------------");
        obj.m3(); // use the values set in m1 method

        // You need to create an Object to access Instance variables inside static methods/area
        System.out.println("--------------------------");
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.flag);

        Employee emp = new Employee();
        System.out.println(emp.companyName); //Microsoft
    }
}
