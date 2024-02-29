package org.alpha.akash.methods;

public class MethodWithClassReturnType {

    public Employee getData1() {
        Employee emp = new Employee();
        return emp;

    }
    public Employee getData2(){return new Employee();}
    public static void main(String[] args) {
        MethodWithClassReturnType obj = new MethodWithClassReturnType();
        Employee ee = obj.getData1();
        System.out.println(ee.empName);
        System.out.println(ee.empId);
        ee.getEmpData();

        Employee empData = obj.getData2();
        System.out.println(empData.empName);
        System.out.println(empData.empId);
        empData.getEmpData();


    }
}

