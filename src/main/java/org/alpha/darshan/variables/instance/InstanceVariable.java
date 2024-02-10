package org.alpha.darshan.variables.instance;

import org.alpha.darshan.variables.defaultvalues.Employee;
import org.alpha.darshan.variables.defaultvalues.Student;

public class InstanceVariable {

    int age;

    String name;

    byte bb;

    double dd;

    {
        age=35;

        name="darhan";

        System.out.println(age);
        System.out.println(name);
    }

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
        System.out.println(emp.CompanyId);
    }

    public void m3(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(bb);
        System.out.println(dd);
    }
    public  void m4(){
        Student st= new Student();
        System.out.println(st.StudentName);

    }

    public static void main(String[] args) {

        InstanceVariable var= new InstanceVariable();

        var.m1();
        var.m2();
        var.m3();
        var.m4();

    }
}
