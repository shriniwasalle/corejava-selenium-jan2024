package org.alpha.darshan.methods;

public class TestMethodWithClassAsParam {

    public  void getDetails(Employee ee,String str){
        System.out.println(ee.empName);
        System.out.println(ee.empId);
        ee.empDetails();
    }


    public static void main(String[] args) {
        TestMethodWithClassAsParam p1= new TestMethodWithClassAsParam();
        Employee e1= new Employee();
        p1.getDetails(e1,"darshan");
    }
}
