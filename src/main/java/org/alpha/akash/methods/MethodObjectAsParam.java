package org.alpha.akash.methods;

public class MethodObjectAsParam {

    public  void  getEmployeeDetails(Employee emp, String name) {
        System.out.println("Employee:- " +emp);
        System.out.println("Employee ID:- " +emp.empId);
        System.out.println("Employee Name:- " +emp.empName);
        System.out.println("name:- " +name);

    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        MethodObjectAsParam obj = new MethodObjectAsParam();
        obj.getEmployeeDetails(emp,"akash");
    }

}
