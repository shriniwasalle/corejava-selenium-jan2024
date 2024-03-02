package org.alpha.darshan.methods;

public class SampleClassReturn1 {

    public  Employee getData(){
        Employee emp= new Employee();

        return emp;
    }

    public static void main(String[] args) {
        SampleClassReturn1 ee= new SampleClassReturn1();
        Employee data=ee.getData();
        System.out.println(data.empName);
        System.out.println(data.empId);
        data.empDetails();
        Employee e1= new Employee();
        System.out.println(e1.empId);
    }
}
