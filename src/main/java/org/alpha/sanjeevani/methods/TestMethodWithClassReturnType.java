package org.alpha.sanjeevani.methods;

public class TestMethodWithClassReturnType {
    public Employee getData(){
        Employee emp=new Employee();
        return emp;
    }
    public Employee getData1(){
        return new Employee();
    }
    public static void main(String[] args) {
        TestMethodWithClassReturnType obj=new TestMethodWithClassReturnType();
        Employee ee=obj.getData();
        System.out.println(ee.empName);
        System.out.println(ee.empId);
        System.out.println(ee.empSalary);
        System.out.println("             ");
        ee.getEmpData();
        Employee emp=obj.getData1();
        System.out.println("                 ");
        emp.getEmpData();
    }
}
