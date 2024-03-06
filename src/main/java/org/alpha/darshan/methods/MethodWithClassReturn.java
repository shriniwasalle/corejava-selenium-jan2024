package org.alpha.darshan.methods;

public class MethodWithClassReturn {

    public Employee returnEmp(){
        Employee e1= new Employee();
        return e1;
    }

    public static void main(String[] args) {
        MethodWithClassReturn m1= new MethodWithClassReturn();
        Employee ee=m1.returnEmp();
        System.out.println(ee.empId);
        System.out.println(ee.empName);
        ee.empDetails();
    }
}
