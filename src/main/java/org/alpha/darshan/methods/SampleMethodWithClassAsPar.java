package org.alpha.darshan.methods;

public class SampleMethodWithClassAsPar {

    public void getDetails(Employee ee, String name){

        System.out.println(ee.empName);
        System.out.println(ee.empId);
        ee.empDetails();
    }

    public static void main(String[] args) {
        Employee emp= new Employee();
        SampleMethodWithClassAsPar p1= new SampleMethodWithClassAsPar();
        p1.getDetails(emp,"darshan");
    }
}
