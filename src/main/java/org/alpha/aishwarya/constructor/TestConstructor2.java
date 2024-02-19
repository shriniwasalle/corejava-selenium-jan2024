package org.alpha.aishwarya.constructor;

public class TestConstructor2 {
    int EmpID;
    String EmpName;

    public TestConstructor2(int a ,String name){
        EmpID= a;
        EmpName= name;
        System.out.println(EmpID);
        System.out.println(name);

    }

    public static void main(String[] args) {
        TestConstructor2 obj = new TestConstructor2(10,"Aishwarya");
    }
}
