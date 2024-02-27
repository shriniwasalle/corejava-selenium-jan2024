package org.alpha.akash.methods;

public class MethodWithDifferentTypeParam {
    public void empDetails(int empId, String empName) {
        System.out.println("Employee Details1: "+empId +" ---" + empName);
    }

    public void empDetails(String empName,int empId) {
        System.out.println("Employee Details2 :"+empName+ "-------" +empId);
    }

    public void employeeSalary(float salary) {
        System.out.println("Employee Salary :"+salary);
    }


    public static void main(String[] args) {
        MethodWithDifferentTypeParam obj = new MethodWithDifferentTypeParam();
        obj.empDetails(100,"Akash");
        obj.empDetails("Akash" , 100);
        obj.empDetails(101,"Rakesh");
        obj.employeeSalary(1100.5f);

        String name="Akki";
        int id = 100;
        obj.empDetails(name, id);











    }

    public void data1(int i, int i1) {
    }
}
