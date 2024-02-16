package org.alpha.akash.methods;

public class MethodWithoutParameter {

    //Non-Static Method or Instance Method
    public void m1() {
        System.out.println("I am in m1 method");
    }
    public void m2() {
        System.out.println("I am in m2 method");
    }

    public static void m3() {

        System.out.println("I am m3 static method");
    }

    public void add(){
        int a=100;
        int b=200;
        System.out.println(a+b);
    }
    public void add1(){
        int a=200;
        int b=300;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodWithoutParameter obj = new MethodWithoutParameter();
        obj.m1();//Without Param
        obj.m2();
        MethodWithoutParameter.m3();

        obj.add();
        obj.add1();

        Employee emp = new Employee();
        emp.getEmpData();


    }

}
