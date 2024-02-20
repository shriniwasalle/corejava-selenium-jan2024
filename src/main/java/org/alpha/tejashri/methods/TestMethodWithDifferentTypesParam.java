package org.alpha.tejashri.methods;

public class TestMethodWithDifferentTypesParam {
    public void empDetails(int empId, String empName){
        System.out.println("Employee Details1: " +empId +"---" +empName);
    }

    public void empDetails(String empName, int empId) {
        System.out.println("Employee Details2: " + empId + "---" + empName);
    }
    public void employeeSalay(float salary)
    {
        System.out.println("Employee Salary:" +salary);
    }
public static void main(String[] args) {
    TestMethodWithDifferentTypesParam obj = new TestMethodWithDifferentTypesParam ();
    obj.empDetails(100, "Tejashri");
    obj.empDetails(200, "Shri");
    obj.empDetails("Boppa", 100);
    obj.employeeSalay(10000.5f);
}
}
