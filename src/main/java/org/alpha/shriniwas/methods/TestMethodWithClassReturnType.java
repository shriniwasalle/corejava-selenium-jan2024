package org.alpha.shriniwas.methods;

public class TestMethodWithClassReturnType {

    public Employee getData1() {
        Employee emp = new Employee();
        return emp;
    }

    public Employee getData2() {
        return new Employee();
    }

    public static void main(String[] args) {
        TestMethodWithClassReturnType obj = new TestMethodWithClassReturnType();
        Employee ee = obj.getData1();
        System.out.println(ee.empName);
        System.out.println(ee.empId);
        ee.getEmpData();

        Employee emp = obj.getData2();
        System.out.println(emp.empName);
        System.out.println(emp.empId);
        emp.getEmpData();
    }
}
