package org.alpha.sanjeevani.corejavaconcepts.accessspecifier1.methods;

public class Employee {
    String empName="sanjeevani";
    int empId=100;
    float empSalary=700.70f;
    public void getEmpData() {
        System.out.println(empName);
        System.out.println(empId);
        System.out.println(empSalary);
    }
    public String getEmpName(){
        return empName;
    }
    public Employee empDetails(){
        return this;
    }
}
