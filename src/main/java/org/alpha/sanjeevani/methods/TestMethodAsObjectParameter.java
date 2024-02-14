package org.alpha.sanjeevani.methods;

public class TestMethodAsObjectParameter {
    public void getEmpDetails(Employee emp){
        System.out.println("Employee name :"+emp.empName);
        System.out.println("Employee Id :"+emp.empId);
        System.out.println("Employee salary :"+emp.empSalary);
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        TestMethodAsObjectParameter obj=new TestMethodAsObjectParameter();
        obj.getEmpDetails(emp);
    }
}
