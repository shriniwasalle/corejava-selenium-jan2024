package org.alpha.darshan.methods;

public class TestMethodWithClassASparameter1 {


    public void getDetails(Employee ee, String name){
        System.out.println(ee.empId+" "+ee.empName);
        System.out.println(name);
    }

    public Employee classDetails(){

        Employee ee1= new Employee();
        
        return ee1;
    }


    public static void main(String[] args) {

        Employee ee= new Employee();

        TestMethodWithClassASparameter1 ts1= new TestMethodWithClassASparameter1();
        ts1.getDetails(ee,"darshan");

       Employee ee2= ts1.classDetails();
        System.out.println(ee2.empId);
        System.out.println(ee2.empName);


    }
}
