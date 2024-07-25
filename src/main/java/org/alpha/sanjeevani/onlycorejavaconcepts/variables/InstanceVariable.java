package org.alpha.sanjeevani.onlycorejavaconcepts.variables;

public class InstanceVariable {
    //<----------------instance variable---------->
    int age=100;
    String name="sanjeevani";
    boolean flag=false;
    //<----------------instance method---------->
    public void m1(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);
    }
    //<----------------static method---------->
    public static void main(String[] args) {
        //<----------------local variable---------->
        InstanceVariable obj=new InstanceVariable();
        obj.m1();
    }
}
