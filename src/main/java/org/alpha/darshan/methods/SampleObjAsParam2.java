package org.alpha.darshan.methods;

public class SampleObjAsParam2 {

    public void param(Employee ee,int i){
        System.out.println(ee.empName);
        System.out.println(ee.empId);
        ee.empDetails();
        System.out.println(i);
    }

    public Employee getDetails() {
    Employee e1= new Employee();
    return e1;
    }

    public static void main(String[] args) {
        Employee emp= new Employee();
        SampleObjAsParam2 obj= new SampleObjAsParam2();
        obj.param(emp,101);
        Employee ee1=obj.getDetails();
        System.out.println(ee1.empId);
        System.out.println(ee1.empName);
        ee1.empDetails();
    }
}
