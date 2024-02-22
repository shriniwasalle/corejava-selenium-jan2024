package org.alpha.tejashri.constructor;

import javax.sql.rowset.serial.SQLOutputImpl;

public class TestConsructor2 {
    int empId;
    String empName;
// constructor with 0- parameter
    public TestConsructor2() {
        System.out.println("---Constructor with 0 parameter---");
        System.out.println(empId); // empId = 0 ->by default value of int
        System.out.println(empName); // empName = null ->by default value of String
    }
    // constructor with parameter
    public TestConsructor2(int empId, String empName) {
        this.empId = empId; // empId = 100
        this.empName = empName; // empName = Shri1
        System.out.println("---Constructor with parameter---");

        //or below way
//    public TestConsructor2(int a, String name) {
//        empId = a; // empId = 100
//        empName = name; // empName = Shri1
//        System.out.println("---Constructor with parameter---");
//        System.out.println(empId);
//        System.out.println(empName);
    }
public void m1(){
    System.out.println("---Method---");
    System.out.println(empId); // empId = 0 ->by default value of int
    System.out.println(empName); // empName = null ->by default value of String
}
    public static void main(String[] args) {
        // object of constructor with 0- parameter
        TestConsructor2 obj1 = new TestConsructor2(); // just created object constructor automatically called

        // object of constructor with parameter
        TestConsructor2 obj2 = new TestConsructor2(100, "Shri1");
        System.out.println(obj2.empId);
        System.out.println(obj2.empName);

        TestConsructor2 obj3 = new TestConsructor2(200, "Shri2");
        System.out.println(obj3.empId);
        System.out.println(obj3.empName);

        // Method object called
        obj1.m1(); // explicitly called method
    }
}