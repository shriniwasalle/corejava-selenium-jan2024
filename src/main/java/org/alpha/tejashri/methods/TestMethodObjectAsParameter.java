package org.alpha.tejashri.methods;

public class TestMethodObjectAsParameter {

    // class as a parameter
    public void getEmployeeDetails(Employee emp, String name) {
        System.out.println("Employee: " + emp); // called from Employee class
        System.out.println("Emp Id: " + emp.empId); // called from Employee class
        System.out.println("Emp Name: " + emp.empName); // called from Employee class
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        TestMethodObjectAsParameter obj = new TestMethodObjectAsParameter();
        obj.getEmployeeDetails(emp, "Shri");
    }
}
