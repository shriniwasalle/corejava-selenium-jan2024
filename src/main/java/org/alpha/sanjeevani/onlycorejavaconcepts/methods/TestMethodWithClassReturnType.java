package org.alpha.sanjeevani.onlycorejavaconcepts.methods;

public class TestMethodWithClassReturnType {
    public Employee1 getData(){
        Employee1 emp1=new Employee1();
        return emp1;
    }
    public Employee1 getData1(){
        return new Employee1();
    }
    public static void main(String[] args) {
        TestMethodWithClassReturnType obj=new TestMethodWithClassReturnType();

        Employee1 ee1=obj.getData();
        System.out.println(ee1.empName);
        System.out.println(ee1.empId);
        System.out.println(ee1.empSalary);
        System.out.println("             ");
        ee1.getEmpData();

        Employee1 emp=obj.getData1();
        System.out.println(emp.empId);
        System.out.println(emp.empName);
        System.out.println(emp.empSalary);

        System.out.println("                 ");
        emp.getEmpData();
    }
}
