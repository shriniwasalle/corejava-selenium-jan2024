package org.alpha.sanjeevani.onlycorejavaconcepts.variables;

public class InstanceVariable1 {
    //Instance Variable
    int age;
    String name;
    boolean flag;
    //direct access
    public void m1(){
        age=30;
        name="sanjeevani";
        flag=true;
        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);
    }
    public void m2(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);
    }
    public void m3(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(flag);
    }
    public static void main(String[] args) {
        InstanceVariable1 obj=new InstanceVariable1();
        obj.m3();//default values print
        System.out.println("-------------------------------");
        obj.m1();
        System.out.println("-------------------------------");
        obj.m2();//use the values set of m1 method
        System.out.println("-------------------------------");
        //you need to create an object to access instance variable inside the static method
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.flag);

    }
}
