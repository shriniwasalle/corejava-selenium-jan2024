package org.alpha.sanjeevani.methods;

public class TestMethodAsObjectParameter {
    public void getEmpDetails(Employee emp){
        System.out.println("Employee name :"+emp.empName);
        System.out.println("Employee Id :"+emp.empId);
        System.out.println("Employee salary :"+emp.empSalary);
    }
    public static void main(String[] args) {
        TestMethodAsObjectParameter obj=new TestMethodAsObjectParameter();
        Employee emp=new Employee();
        obj.getEmpDetails(emp);
    }
}
