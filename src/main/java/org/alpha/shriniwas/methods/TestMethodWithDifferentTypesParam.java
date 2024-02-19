package org.alpha.shriniwas.methods;

public class TestMethodWithDifferentTypesParam {

    public void empDetails(int empId, String empName) {
        System.out.println("Employee Details1 :" +empId +"---" +empName);
    }

    public void empDetails(String empName, int empId) {
        System.out.println("Employee Details2 :" +empName +"---" +empId);
    }

    public void employeeSalary(float salary) {
        System.out.println("Employee Salary: " +salary);
    }

    public static void main(String[] args) {
        TestMethodWithDifferentTypesParam obj = new TestMethodWithDifferentTypesParam();
        obj.empDetails(100, "Shriniwas");
        obj.empDetails(200, "Shri");
        obj.empDetails("Alle", 100);
        obj.employeeSalary(1000.5f);

        String name = "Rohit";
        int id = 101;
        obj.empDetails(name, id);
    }
}
