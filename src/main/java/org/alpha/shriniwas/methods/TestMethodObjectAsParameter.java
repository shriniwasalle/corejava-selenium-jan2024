package org.alpha.shriniwas.methods;

import org.alpha.shriniwas.methods.Employee;

public class TestMethodObjectAsParameter {

    public void getEmployeeDetails(Employee emp, String name) {
        System.out.println("Employee : " +emp);
        System.out.println("Emp Id: " +emp.empId);
        System.out.println("Emp Name: " +emp.empName);
        System.out.println("Name: " +name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        TestMethodObjectAsParameter obj = new TestMethodObjectAsParameter();
        obj.getEmployeeDetails(emp, "Shrini");
    }
}
