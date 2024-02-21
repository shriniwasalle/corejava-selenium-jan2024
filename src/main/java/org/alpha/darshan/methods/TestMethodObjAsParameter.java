package org.alpha.darshan.methods;

import org.alpha.darshan.methods.Employee;

public class TestMethodObjAsParameter {

    public  void  getEmployeeDetails(Employee ee,Employee1 eee,String name){
        System.out.println(ee.empId);
        System.out.println(ee.empName);
        ee.empDetails();
        System.out.println(name);
        eee.empAddress("Solapur");

    }

    public static void main(String[] args) {
        TestMethodObjAsParameter emp= new TestMethodObjAsParameter();

        Employee ee= new Employee();

        Employee1 emp1= new Employee1();
        emp.getEmployeeDetails(ee,emp1,"darshan");

    }
}
