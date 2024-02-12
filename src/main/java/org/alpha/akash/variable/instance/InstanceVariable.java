package org.alpha.akash.variable.instance;

import org.alpha.akash.variable.Employee;

public class InstanceVariable {
    //Instance Variables
    int age;
    String name;
    boolean flag;


    //Instance Variables
    public void  m1() {
        //Direct Access
        age = 10;
        name = "Akash";
        flag = true;

        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);

    }

    public void m2() {

        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);

    }

    public void m3() {

        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);

    }


    public static void main(String[] args) {

        InstanceVariable obj = new InstanceVariable();
        obj.m2();
        obj.m1();
        obj.m3();

        // You need to create an Object to access Instance variables inside static methods/area

        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.flag);

        Employee emp = new Employee();
        System.out.println(emp.companyName);

    }


}
