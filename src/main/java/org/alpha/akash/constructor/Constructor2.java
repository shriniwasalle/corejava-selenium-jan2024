package org.alpha.akash.constructor;

public class Constructor2 {

    int empId;

    String empName;

    public  Constructor2(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

//    public void m1() {
//        System.out.println(empId);
//        System.out.println(empName);
//    }

    public static void main(String[] args) {
        Constructor2 obj = new Constructor2(100,"Akash");

        System.out.println(obj.empName);//Akash
        System.out.println(obj.empId);//100

//        obj.m1();
    }
}
