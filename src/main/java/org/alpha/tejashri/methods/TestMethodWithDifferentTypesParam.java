package org.alpha.tejashri.methods;

public class TestMethodWithDifferentTypesParam {
    public void empDetails(int empId, String empName) {
        System.out.println("Employee Details1 : " +"id is " + empId + " name is " + empName);
    }

    public void empDetails(String empName, int empId) {
        System.out.println("Employee Details2 : " +"id is " + empId + " name is " + empName);
    }

    public void employeeSalay(float salary) {
        System.out.println("Employee Salary : " + salary);
    }

    public static void myMethod(String name, int age) {
        System.out.println(name + "is " + age + " year old");
    }

    public static void main(String[] args) {
        TestMethodWithDifferentTypesParam obj = new TestMethodWithDifferentTypesParam();
        obj.empDetails(100, "Tejashri");
        obj.empDetails(200, "Shri");
        obj.empDetails("Boppa", 1010);
        obj.employeeSalay(10000.5f);

        String name = "Mahi";
        int id = 1000;
        obj.empDetails(name, id); // call to Employee Details2 method

        myMethod("Mahika ", 5);
        myMethod("Anshika ", 3);
    }
}
