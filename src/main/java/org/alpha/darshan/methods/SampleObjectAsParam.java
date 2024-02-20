package org.alpha.darshan.methods;

public class SampleObjectAsParam {

    public  void empDetails(Employee ee,String name){
        System.out.println(ee.empId);
        System.out.println(ee.empName);
        ee.empDetails();
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        SampleObjectAsParam p1= new SampleObjectAsParam();
        p1.empDetails(emp,"darshan");
    }
}
