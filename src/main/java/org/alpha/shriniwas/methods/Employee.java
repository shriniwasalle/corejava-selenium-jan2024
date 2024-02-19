package org.alpha.shriniwas.methods;

public class Employee {

    String empName = "Shriniwas";
    int empId = 100;

    public void getEmpData() {
        System.out.println("Shriniwas");
        System.out.println("Alle");
        System.out.println("Microsoft");
    }

    public String getEmployeeName() {
        return empName;
    }

    public Employee getEmployeeDetails() {
        return this;
    }
}
