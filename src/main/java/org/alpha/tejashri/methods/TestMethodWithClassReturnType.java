package org.alpha.tejashri.methods;

public class TestMethodWithClassReturnType {
    public Employee getData1(){
       Employee emp = new Employee(); // called by object creation of Employee class.
                                        /*Local variable 'emp' is redundant
                                        so instead of this use return newEmployee()
                                        See used in getData2 method */
        return emp;
    }
    public Employee getData2(){
        return new Employee(); // direct called without object creation of Employee class.
    }
    public static void main(String[] args) {
        TestMethodWithClassReturnType obj = new TestMethodWithClassReturnType(); // created object

        System.out.println("---- With object creation of class Employee ----");
        Employee ee =  obj.getData1(); // called to getData
        System.out.println(ee.empName);
        System.out.println(ee.empId);
       ee.getEmpData();

        System.out.println("---- direct called / Without object creation of class Employee ----");
        Employee emp = obj.getData2();
        System.out.println(emp.empName);
        System.out.println(emp.empId);
        emp.getEmpData();

    }
}
