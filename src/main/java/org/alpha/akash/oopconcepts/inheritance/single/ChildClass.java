package org.alpha.akash.oopconcepts.inheritance.single;

public class ChildClass extends ParentClass {

    int age = 24;

    public void getdata() {
        System.out.println(age);//24
        System.out.println(this.age);//24
        System.out.println(super.age);//100
        System.out.println(name);//Akash

    }

    public void m1() {
        System.out.println("I am in m1 of ChildClass");
        super.m1();//ParentClass : m1()'s called
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
//        ChildClass's Reference
//    '   ChildClass object

        obj.getdata(); //ChildClass : getData()

        obj.getDetails(); //ParentClass :getDetails()

        System.out.println(obj.age);
        System.out.println(obj.name);
        obj.m1();
    }

}
