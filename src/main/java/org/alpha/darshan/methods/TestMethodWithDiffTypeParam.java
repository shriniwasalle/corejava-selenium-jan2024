package org.alpha.darshan.methods;

public class TestMethodWithDiffTypeParam {


    public void empDetails(int empId, String empName){

        System.out.println("empId"+empId+"--"+"empName"+empName);
    }
    public static void main(String[] args) {
        TestMethodWithDiffTypeParam emp= new TestMethodWithDiffTypeParam();
        emp.empDetails(101,"darshan");
    }
}
