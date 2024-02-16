package org.alpha.shriniwas.constructor;

public class TestConstructor2 {

    int empId;
    String empName;

    public TestConstructor2(int empId, String empName) {
        this.empId = empId; // empId = 100
        this.empName = empName; // empName = Shri1
    }

    public void m1() {
        System.out.println(empId);
        System.out.println(empName);
    }

    public static void main(String[] args) {
        TestConstructor2 obj1 = new TestConstructor2(100, "Shri1");
        System.out.println(obj1.empId);
        System.out.println(obj1.empName);

        TestConstructor2 obj2 = new TestConstructor2(200, "Shri2");
        System.out.println(obj2.empId);
        System.out.println(obj2.empName);

        // obj1.m1();
    }
}
