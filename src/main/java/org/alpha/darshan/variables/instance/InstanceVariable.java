package org.alpha.darshan.variables.instance;

import org.alpha.darshan.variables.defaultvalues.Employee;

public class InstanceVariable {

    int age;

    String name;

    byte bb;

    double dd;

    public void m1() {
        age = 18;

        name = "darshan";

        bb = 127;

        dd = 858882;
        System.out.println(age);
        System.out.println(name);
        System.out.println(bb);
        System.out.println(dd);

    }

    public  void m2(){

        Employee emp= new Employee();

        System.out.println(emp.CompanyNme);
    }

    public static void main(String[] args) {

        InstanceVariable var= new InstanceVariable();

        var.m1();
        var.m2();

    }
}
